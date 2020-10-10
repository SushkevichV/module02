package by.tce.jonline.module2;

import java.util.Random;

/*
 * Данa последовательность целых чисел. Образовать новую последовательность, выбросив из 
 * исходной те члены, которые равны min(a[1],a[2],...,a[n])
 */

public class Arr08 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int count = 0;
		int j =0;
		
		Random x = new Random();
				
		System.out.println("Исходный массив");
		for(int i=0; i<a.length; i++) { 
			a[i]=x.nextInt(20);
			System.out.print(a[i]+" ");
		}
		
		int min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if (min>a[i]) { 
				min=a[i];
			}
		}
		
		System.out.println();
		System.out.println("Наименьший элемент массива равен "+min);
		
		for(int i=0; i<a.length; i++) {
			if (min==a[i]) { 
				count++; // Определяем количество минимальных элементов
			}
		}
		
		count=a.length-count; // Определяем размер нового массива
		int[] b = new int[count];
		
		System.out.println();
		System.out.println("Новый массив");
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>min) {
				b[j]=a[i];
				System.out.print(b[j]+" ");
				j++;
			}
		}

	}

}
