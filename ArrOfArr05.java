package by.tce.jonline.module2;

/* Сформировать квадратную матрицу порядка n (четное) по образцу
 *  1   1  1 ... 1  1  1
 *  2   2  2 ... 2  2  0
 *  3   3  3 ... 3  0  0
 * n-1 n-1 0 ... 0  0  0
 *  n   0  0 ... 0  0  0
 */
public class ArrOfArr05 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length-i; j++) { 
				a[i][j]=i+1;
			}
		}
			
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
