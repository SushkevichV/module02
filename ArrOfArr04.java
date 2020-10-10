package by.tce.jonline.module2;

// Сформировать квадратную матрицу порядка n (четное) с прямой и обратной последовательностью значений  
 

public class ArrOfArr04 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (i%2==0) {
					a[i][j]=j+1;
				}
				else {
					a[i][j]=a[i].length-j;
				}
				
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
					

	}


}
