package by.tce.jonline.module2;

/* Задан массив D. Определить следующие суммы d[1]+d[2]+d3; d[2]+d[3]+d[4]; d[3]+d[4]+d[5]
 * Составить метод (методы) для вычисления суммы трех последовательно расположенных 
 * элементов массива с номерами от k до m
 */

public class Deco08 {

	public static void main(String[] args) {
		int m=10;
		int[] d = new int [m];
		
		System.out.println("Заданный массив D:");
		for(int i=0; i<m; i++) {
			d[i]=(int)(Math.random()*10);
			System.out.print(d[i]+" ");
		}
		
		System.out.println();
		for(int i=0; i<d.length-2; i++) {
			System.out.println("Сумма элементов от D["+(i+1)+"] до D["+(i+3)+"] равна "+Sum(d,i));
		}

	}

	private static int Sum(int[] d, int i) {
		int sum = 0;
		
		for(int j=i; j<=i+2; j++) {
			sum+=d[j];	
		}
		
		return sum;
	}

}
