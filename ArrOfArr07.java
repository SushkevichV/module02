package by.tce.jonline.module2;

/* Сформировать квадратную матрицу порядка N по правилу A[i,j] = sin(( i(2) - j(2) ) / N)
 * и посчитать количество положительных элементов в ней
 */

public class ArrOfArr07 {

	public static void main(String[] args) {
		int n=10;
		double[][] a = new double[n][n];
		int k = 0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=Math.sin((i*i-j*j)/a.length);
				if (a[i][j]>0) {
					k++;
				}
			}
		}
		
		System.out.println("Количество положительных элементов матрицы равно "+k);

	}

}
