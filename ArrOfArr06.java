package by.tce.jonline.module2;

/* Сформировать квадратную матрицу порядка n (четное) по образцу
 *  1 1 1 ... 1 1 1
 *  0 1 1 ... 1 1 0
 *  0 0 1 ... 1 0 0
 *  0 1 1 ... 1 1 0
 *  1 1 1 ... 1 1 1
 */

public class ArrOfArr06 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		
		for (int i=0; i<a.length/2; i++) {
			for (int j=i; j<a[i].length-i; j++) { 
				a[i][j]=1;
			}
		}
			
		for (int i=a.length/2; i<a.length; i++) {
			for (int j=a[i].length-i-1; j<i+1; j++) { 
				a[i][j]=1;
			}
		}
			
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) { 
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
