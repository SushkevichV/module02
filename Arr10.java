package by.tce.jonline.module2;

import java.util.Random;

/*
 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый
 * второй элемент (освободившиеся элементы заполнить нулями). Дополнительный массив не использовать.
 */

public class Arr10 {

	public static void main(String[] args) {
		int[] a = new int[12];
		Random x= new Random();
		int step = 0;
		
		System.out.println("Исходный массив");
		for(int i=0; i<a.length; i++) {
			a[i]=x.nextInt(10);
			System.out.print(a[i]+" ");
		}
		
		for(int i=2; i<a.length; i+=2) {
			if(i+1<a.length) {
				a[i+1]=0;
			}
			a[i-1-step]=a[i];
			a[i]=0;
			step+=1;
		}
		
		System.out.printf("%nСжатый массив%n");
		for(int i : a) {
			System.out.print(i+" ");
		}
		
	}

}
