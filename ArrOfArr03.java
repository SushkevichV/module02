package by.tce.jonline.module2;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */

public class ArrOfArr03 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		int k = (int)(Math.random()*n);
		int p = (int)(Math.random()*n);
		
		for(int i=0; i<a.length; i++) { 
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*10);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(k+"-я строка матрицы");
		
		for(int i=0; i<a[k].length; i++) {
			System.out.print(a[k][i]);
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println(p+"-й столбец матрицы");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i][p]);
		}

	}

}
