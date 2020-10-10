package by.tce.jonline.module2;

import java.util.Random;

/* Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу
 * и номера строк, в которых число 5 встречается три и более раз
 */

public class ArrOfArr11 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		Random x = new Random();
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=x.nextInt(16);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Число 5 встречается три и более раз в строках ");
		
		for(int i=0; i<a.length; i++) {
			int k=0;
			
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j]==5) {
					k++;
				}
			}
			
			if (k>2) {
				System.out.print(i+", ");
			}
			
		}

	}

}
