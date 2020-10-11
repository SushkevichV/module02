package by.tce.jonline.module2;

/* Даны натуральные числа K и N. Написать метод (методы) для формирования массива A, 
 * элементами которого являются числа, сумма цифр которых равна K и которые не больше N.
 */

public class Deco12 {

	public static void main(String[] args) {
		int n = 10000;
		int k = 30;
		int j = 0;
		
		for (int i=0; i<=n; i++) {
			if(sum(i)==k) {
				j++; // Определяем размер массива
			}
		}
		
		int[] a = new int[j];
		
		j=0;
		
		for (int i=0; i<=n; i++) {
			if(sum(i)==k) {
				a[j]=i; // Заполняем массив
				j++;
			}
		}
		
		for(int i:a) {
			System.out.println(i+" ");
		}

	}
	
	private static int sum(int n) {
		int s=0;
		
		while (n>0) {
			s+=n%10;
			n=n/10;
		}
		return s;
	}

}
