package by.tce.jonline.module2;

import java.util.Random;

/*
 * В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K
 */

public class Arr01 {

	public static void main(String[] args) {
		int[] a = new int [20];
		int k = 5;
		int sum = 0;
		Random x = new Random();
		
		for (int i=0; i<a.length; i++) {
			a[i] = x.nextInt(100)+1;
			System.out.print(a[i]+" ");
		}
		
		for (int i=0; i<a.length; i++) {
			if (a[i]%k == 0) {
				sum+=a[i];
			}
		}
		
		System.out.println();
		System.out.println("Сумма элементов массива, кратных " + k + ", равна " + sum);

	}

}
