package by.tce.jonline.module2;

/* Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму
 */

public class ArrOfArr09 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		int max=0;
		int s=0;
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*n);
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<a[0].length; i++) {
			int sum = 0;
			for(int j=0; j<a.length; j++) {
				sum+=a[j][i];
			}
			if (max<sum) {
				max=sum;
				s=i;
			}
			System.out.print(sum+" ");
		}
		
		System.out.format("%n%nСтолбец %d содержит наибольшую сумму элементов >> %d", s, max);

	}

}
