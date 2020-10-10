package by.tce.jonline.module2;

import java.util.Random;

/*
 * Даны целые числа. Вывести на печать только те числа, для которых a[i]>i
 */
public class Arr05 {

	public static void main(String[] args) {
		int[] a = new int[10];
		Random x = new Random();
		
		System.out.println("Элементы, для которых a[i]>i:");
		for (int i=0; i<a.length; i++) {
			a[i] = x.nextInt(10);
			if (a[i]>i) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
