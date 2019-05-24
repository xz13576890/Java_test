package Test_Algorithm;

public class CostMap {
	int fromTo[][];
	int size;

	public CostMap(int n) {
		fromTo = new int[n][n];
		size = n;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				fromTo[i][j] = -1;
	}

	public int min() {
		int min = -1;
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				if (fromTo[i][j] != -1 && (min == -1 || fromTo[i][j] < min))
					min = fromTo[i][j];
		return min;
	}

	static public CostMap join(CostMap cm1, CostMap cm2) {
		CostMap res = new CostMap(cm1.size);
		for (int i = 0; i < res.size; i++) {
			for (int j = 0; j < res.size; j++) {
				res.fromTo[i][j] = -1;
				for (int k = 0; k < res.size; k++) {
					if (cm1.fromTo[i][k] != -1 &&  cm2.fromTo[k][j] != -1) {
					int sum = cm1.fromTo[i][k] + cm2.fromTo[k][j];
					if (res.fromTo[i][j] == -1 || sum < res.fromTo[i][j])
						res.fromTo[i][j] = sum;
					}
				}

			}
		}
		return res;

	}

}
