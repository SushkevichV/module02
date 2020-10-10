package by.tce.jonline.module2;

import java.util.Random;

/*
 * В массиве целых чисел найти наиболее часто встречающееся число.
 * Если таких чисел несколько, определить наименьшее из них.
 */

public class Arr09 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int countMax = 0;
		int min = 0;
		Random x = new Random();
		
		for (int i=0; i<a.length; i++) {
			a[i]=x.nextInt(10);
			System.out.print(a[i]+" ");
		}
				
		for (int i=0; i<a.length; i++) {
			int count = 0;					// Обнуляем счетчик повторений
			for(int j=0; j<a.length; j++) {	// Считаем кол-во повторений
				if(a[i]==a[j]) {
					count++;
				}
			}
			if (count>countMax) {			// Если кол-во повторений превышено,
				countMax = count;			// записываем новый рекорд
				min = a[i];					// Считаем, что значение является минимальным
			}
			if (count==countMax) {			// Если кол-во повторений совпало,
				if (min>a[i])				// выбираем наименьшее значение
					min=a[i];
			}
		}
		
		System.out.println();
		System.out.println("Минимальное число из наиболее часто встречающихся элементов >> "+min+" встречается "+countMax+" раз(а).");
		
	}

}
