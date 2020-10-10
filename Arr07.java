package by.tce.jonline.module2;

/*
 * Даны действительные числа. Найти max(a[1]+a[n], a[2]+a[n-1], ... )
 */

public class Arr07 {

	public static void main(String[] args) {
		double[] a = new double[10];
						
		for(int i=0; i<a.length; i++) {
			a[i]=Math.random()*50;
			System.out.println(a[i]);
		}
		
		double max = a[0];
		
		for(int i=0; i<a.length/2; i++) {
			if (max<a[i]+a[a.length-i-1]) {
				max=a[i]+a[a.length-i-1];
			}
		}
		
		System.out.println("Наибольший элемент max(a[1]+a[n], a[2]+a[n-1], ...) равен "+max);

	}

}