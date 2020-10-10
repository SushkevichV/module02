package by.tce.jonline.module2;

import java.util.Random;

/*
 * Дана последовательность действительных чисел. Заменить все ее члены, большие Z, этим числом.
 * Подсчитать количество замен.
 */

public class Arr02 {

	public static void main(String[] args) {
		double[] a = new double [20];
		double z = 10;
		int j = 0;
		Random x = new Random();
		
		System.out.println("Исходный массив:");
		for (int i=0; i < a.length; i++) {
			a[i] = x.nextDouble()*20;
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("Измененный массив:");
		for (int i=0; i < a.length; i++) {
			if (a[i]>z) { 
				a[i] = z;
				j++;
			}
			System.out.println(a[i]);
		}
		
		System.out.println("Произведено "+j+" замен.");

	}

}
