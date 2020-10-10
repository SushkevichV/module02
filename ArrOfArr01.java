package by.tce.jonline.module2;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

public class ArrOfArr01 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j] = (int)(Math.random()*10);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		for (int i=0; i<a.length; i++) {
			for (int j=1; j<a[i].length; j+=2) {
				if (a[0][j]>a[a.length-1][j]) {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
