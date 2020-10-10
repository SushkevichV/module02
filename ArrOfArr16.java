package by.tce.jonline.module2;

// Построить магический квадрат порядка n

public class ArrOfArr16 {

	public static void main(String[] args) {
		int n=7;
		int[][] a = new int[n][n];
		int num = 1;
	    int r = 0;
	    int c = n / 2;
	    int cur_r;
	    int cur_c;
	    
	    while (num <= n * n) {
	        a[r][c] = num;
	        num++;
	        cur_r = r;
	        cur_c = c;
	        r -= 1;
	        c += 1;
	        if (r == -1) {
	            r = n - 1;
	        }
	        if (c == n) {
	            c = 0;
	        }
	        if (a[r][c] != 0) {
	            r = cur_r + 1;
	            c = cur_c;
	            if (r == -1) {
	                r = n - 1;
	            }
	        }
	    }

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a.length; j++) {
	            System.out.print(a[i][j] + " ");
	        }
	        System.out.println();
	    }
		
		

	}

}
