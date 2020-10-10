package by.tce.jonline.module2;

import java.util.Scanner;

/* В числовой матрице поменять местами два любых столбца с сохранением порядка элементов столбцов.
 * Номера столбцов вводит пользователь с клавиатуры.
 */

public class ArrOfArr08 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		int x;
		int y;
		int tmp;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*n);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		x=scanner(1, a[0].length);
		y=scanner(2, a[0].length);
		
		System.out.println();
		System.out.format("Меняем местами %d-й и %d-й столбцы%n", x, y);
		
		for (int i=0; i<a.length; i++) {
			tmp=a[i][x];
			a[i][x]=a[i][y];
			a[i][y]=tmp;
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) { 
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public static int scanner(int i, int x) {
		int y=-1;
		
		while ((y<0) || (y>=x)) //Пользователь должен ввести номер существующего столбца от 0 до 9
			y=console(i);
			
		return y;
	}

	public static int console(int x) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите номер " + x +"-го столбца для замены >> ");
		
		while (!scanner.hasNextInt()) {// пользователь должен ввести целое число
			System.out.print("Введите номер " + x +"-го столбца для замены >> ");
			scanner.next();
		}
		
		return scanner.nextInt();
	}

}
