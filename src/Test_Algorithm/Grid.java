package Test_Algorithm;

import java.util.Random;

public class Grid {
	
	int grid[][];
	int columns;
	int rows;
	
    public Grid(int c, int r) {
    	columns = c;
    	rows = r;
    	grid = new int[c][r];
    	Random rd = new Random(0);
    	for (int y = 0; y< rows;y++) {
    		for (int x = 0; x< columns;x++) {
        		grid[x][y] = rd.nextInt(9) + 1;
        	}
    	}
    }
    
    
    public String show() {
    	String res = "";
    	for (int y = 0; y< rows;y++) {
    		for (int x = 0; x< columns;x++) {
        		res += String.format(" %2d", grid[x][y]);
        	}
    		res+="\n";
    	}
    	return res;
    }
}
