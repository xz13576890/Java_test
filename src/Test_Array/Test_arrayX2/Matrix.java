package Test_Array.Test_arrayX2;


public class Matrix {
    public static void main(String[] args) {
        int[][] a = {
                {1,3},
                {2,4},
        };
        int[][] b ={
                {3,4},
                {5,6},
        };
        int[][] c = new int[2][2];
        //c[0][0] = a[0][0] + b[0][0]; 矩阵加法原理
        //c[0][1] = a[0][1] + b[0][1];
        //……
        //用for循环写矩阵加法
        for (int i=0; i < c.length; i++){
            for (int j =0; j < c.length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        int[][] d = addMx(a,b);
        printMx(d);

    }

    /**
     * 矩阵加法
     * @param a
     * @param b
     * @return
     */
    private static int[][] addMx(int[][] a, int[][] b){
        int[][] c = new int[a.length][a.length];
        for (int i=0; i < c.length; i++){
            for (int j =0; j < c.length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    /**
     * 打印指定的矩阵
     * @param c
     */
    private static void  printMx(int[][] c){
        //打印矩阵方法封装
        for (int i=0; i < c.length; i++){
            for (int j =0; j < c.length; j++){
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
