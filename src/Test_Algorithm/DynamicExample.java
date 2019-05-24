package Test_Algorithm;/*
 * Performance Examples - Eric McCreath 2018
 * 
 * Looking at the problem of finding the minimum path from one side of a grid to the other side of the grid.
 * As you move across the cost is the accumulated value of the grid points you pass over.  You always move 
 * one column at a time (from left to right), and you can move across and up one, directly across, or across and 
 * down one row.   Noting the rows "wrap".  So if you are in the top row and move "up" you end up in the bottom 
 * row. 
 * 
 * So in the grid below:
 7  8  5  3  9  3
 9  4  7  3  6  9
 3  2  9  6  5  7
 6  3  5  1  3  6

 the minimum path is 17.  This is achieved by going:
 3->2->5->1->3->3 

 * 
 */

public class DynamicExample {

	static long callcount;

	// Dynamic Programming Approach
	static public int minPathCostDP(Grid g) {

		
		// init the current cost to all 0s
		int currentcost[], nextcost[];
		currentcost = new int[g.rows];
		nextcost = new int[g.rows];
		for (int i = 0; i < g.rows; i++)
			currentcost[i] = 0;

		// go across the columns calculating the minimum cost
		// to get to that column. 
		for (int y = 0; y < g.columns; y++) {
			for (int i = 0; i < g.rows; i++) {
				nextcost[i] = Math
						.min(currentcost[(i - 1 + g.rows) % g.rows],
								Math.min(currentcost[i], currentcost[(i + 1)
										% g.rows]))
						+ g.grid[y][i];
			}
			for (int i = 0; i < g.rows; i++) {
				currentcost[i] = nextcost[i];
			}
		}

		// find and return the minimum
		int m = currentcost[0];
		for (int i = 1; i < g.rows; i++) {
			if (m > currentcost[i])
				m = currentcost[i];
		}
		return m;
	}

	// Greedy approach
	// 找每次选择中的最小值，然后接着此次选择继续选择最优（最终结果未必是最优，因为一次最多只有三个选择）
	static public int minPathCostGreedy(Grid g) {
		// find the smallest value to start with--起点可以选择最优
		int pos = 0;
		int m = g.grid[0][0];
		for (int i = 1; i < g.rows; i++) {
			if (m > g.grid[0][i]) {
				m = g.grid[0][i];
				pos = i;
			}
		}

		// sum the path going across the grid - in each step take the path that
		// minimizes to local cost.
		int total = m;
		for (int y = 1; y < g.columns; y++) {
			int n1 = g.grid[y][(pos - 1 + g.rows) % g.rows];
			int n2 = g.grid[y][(pos) % g.rows];
			int n3 = g.grid[y][(pos + 1) % g.rows];
			if (n1 <= n2 && n1 <= n3) {
				total += n1;
				pos = (pos - 1 + g.rows) % g.rows;
			} else if (n2 <= n3) {
				total += n2;
			} else {
				total += n3;
				pos = (pos + 1) % g.rows;
			}
		}
		return total;

	}

	// Branch and Bound approach
	static public int minPathCostBranchAndBound(Grid g) {
		int minfromcol[];
		minfromcol = new int[g.columns + 1];
		int maxfromcol[];
		maxfromcol = new int[g.columns];

		// calculate the minimum possible cost from a column to the end based
		// on the minimum value of each column. 
		int minsum = 0;
		int maxsum = 0;
		minfromcol[g.columns] = 0;
		for (int i = g.columns - 1; i >= 0; i--) {
			int mincol = g.grid[i][0];
			int maxcol = g.grid[i][0];
			for (int j = 1; j < g.rows; j++) {
				mincol = Math.min(mincol, g.grid[i][j]);
				maxcol = Math.max(maxcol, g.grid[i][j]);
			}
			minsum += mincol;
			maxsum += maxcol;
			minfromcol[i] = minsum;
			maxfromcol[i] = maxsum;
		}

		Bounds global = new Bounds(minfromcol[0], maxfromcol[0]);

		
		// follow the recursive stucture of the brute force approach - with the addition of prune branches
		// that you know will not be better then the best possible so far. 
		int m = minPathCostBranchAndBoundFromPoint(g, 0, 0, 0, minfromcol,
				global);
		for (int i = 1; i < g.rows; i++) {
			int v = minPathCostBranchAndBoundFromPoint(g, 0, i, 0, minfromcol,
					global);
			if (v != -1 && m > v) {
				m = v;
			}
		}
		return m;

	}

	// using -1 to mean over bound and to cut from search
	private static int minPathCostBranchAndBoundFromPoint(Grid g, int c, int r,
			int costSoFar, int mincolfrom[], Bounds global) {
		// System.out.println("bb c : " + c + " r : " + r + " csf : " +
		// costSoFar + " gu
		// : " + global.upper);
		callcount++;
		if (c == g.columns) {
			return 0;
		} else if (costSoFar + g.grid[c][r] + mincolfrom[c + 1] >= global.upper) {
			return -1;

		} else {
			int thisNodeCost = g.grid[c][r];

			int nextnodes[] = { (r - 1 + g.rows) % g.rows, r, (r + 1) % g.rows };
			int v;
			int m = -1;

			for (int n = 0; n < 3; n++) {
				if (global.upper > costSoFar + thisNodeCost + mincolfrom[c + 1]) {
					v = minPathCostBranchAndBoundFromPoint(g, c + 1,
							nextnodes[n], costSoFar + thisNodeCost, mincolfrom,
							global);
					if (v != -1 && (m == -1 || v < m)) {
						m = v;
						if (costSoFar + thisNodeCost + v < global.upper)
							global.upper = costSoFar + thisNodeCost + v;
					}
				}
			}
			if (m == -1)
				return -1;
			return thisNodeCost + m;
		}
	}

	static public int minPathCostBruteForceFromPoint(Grid g, int c, int r) {
		// System.out.println("bf c : " + c + " r : " + r );
		callcount++;
		if (c == g.columns) {
			return 0;
		} else {
			//起始点的上中下三个方向都可以选择，上下看成是可以滚动的
			int c1 = minPathCostBruteForceFromPoint(g, c + 1, (r - 1 + g.rows)
					% g.rows);
			int c2 = minPathCostBruteForceFromPoint(g, c + 1, r);
			int c3 = minPathCostBruteForceFromPoint(g, c + 1, (r + 1) % g.rows);
			return g.grid[c][r] + Math.min(c1, Math.min(c3, c2));
		}
	}
	
    //BruteForce approach-- 穷举法，即算所有可能性
	static public int minPathCostBruteForce(Grid g) {
		int m = minPathCostBruteForceFromPoint(g, 0, 0);
		for (int i = 1; i < g.rows; i++) {
			int v = minPathCostBruteForceFromPoint(g, 0, i);
			if (m > v) {
				m = v;
			}
		}
		return m;
	}
  
	// Divide and Conquer approach--二分法
	static public int minPathCostDivideAndConquer(Grid g) {
		CostMap cm = minPathCostDivideAndConquerFromSize(0, g.columns, g);
		return cm.min();
	}

	private static CostMap minPathCostDivideAndConquerFromSize(int i, int s,
			Grid g) {
		if (s > 1) {  // if bigger than 1 then divide in 2 and solve sub-problems then combine the result
			int h = s / 2;
			return CostMap.join(minPathCostDivideAndConquerFromSize(i, h, g),
					minPathCostDivideAndConquerFromSize(i + h, s - h, g));
		} else if (s == 1) { // solve the problem of size 1
			CostMap cp = new CostMap(g.rows);
			for (int j = 0; j < g.rows; j++) {
				cp.fromTo[j][(j - 1 + g.rows) % g.rows] = g.grid[i][j];
				cp.fromTo[j][j] = g.grid[i][j];
				cp.fromTo[j][(j + 1) % g.rows] = g.grid[i][j];
			}
			return cp;
		} else {
			throw new Error();
		}
	}

	public static void main(String[] args) {
		Grid g = new Grid(15, 10); // (18,20) - is a big one

		System.out.println(g.show());
		System.out.println("minPathCost  (Dynamic Programming Approach): "
				+ minPathCostDP(g));
		System.out.println("minPathCost  (Greedy approach): "
				+ minPathCostGreedy(g));
		System.out.println("minPathCost  (Divide and Conquer approach): "
				+ minPathCostDivideAndConquer(g));
		callcount = 0;
		System.out.println("minPathCost  (Branch and Bound approach): "
				+ minPathCostBranchAndBound(g) + " callcount " + callcount);
		callcount = 0;
		System.out.println("minPathCost  (BruteForce): "
				+ minPathCostBruteForce(g) + " callcount " + callcount);
	}

}
