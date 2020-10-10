package by.tce.jonline.module2;

import java.util.Random;

/* Сфрмировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом
 * столбце число единиц равно номеру столбца
 */

public class ArrOfArr14 {

	public static void main(String[] args) {
		Random x = new Random();
		
		int[][] a = new int[x.nextInt(10)+1][x.nextInt(10)+1]; //матрица должна иметь минимум одну стоку и столбец
		
		/* Столбцы нумеруются с нуля, поэтому в нулевом столбце единиц нет. 
		 * Если в столбце недостаточно ячеек, чтобы разместить все единицы,
		 * т.е. количество столбцов превышает количество строк,
		 * столбец будет заполнен единицами на сколько хватит ячеек
		 */
		
		for(int i=0; i<a[0].length; i++) {
			int count = 0;
			for(int j=0; j<a.length; j++) {
				if (count<i) {
					a[j][i]=1;
					count++;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
