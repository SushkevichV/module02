package by.tce.jonline.module2;

/*
 * Даны действительные числа. Поменять местами наибольший и наименьший элементы.
 */

public class Arr04 {

	public static void main(String[] args) {
		double max = 0;
		double min = 0;
		double tmp = 0;
		int maxI = 0;
		int minI = 0;
		double[] a = new double[10];
		
		for (int i=0; i<a.length; i++) {
			a[i]=Math.random()*100-50;
			System.out.println(a[i]);
		}
		
		for (int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
				maxI=i;
			}
			if(min>a[i]) {
				min=a[i];
				minI=i;
			}
						
		}
		
		System.out.println();
		tmp = a[maxI];
		a[maxI] = a[minI];
		a[minI] = tmp;
		System.out.println("Поменялись местами "+minI+"-й и "+maxI+"-й элементы");
		System.out.println();
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
