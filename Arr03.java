package by.tce.jonline.module2;

/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов
 */

public class Arr03 {

	public static void main(String[] args) {
		double[] a = new double[50];
		int p=0;
		int n=0;
		int z=0;
		
		for (int i=0; i<a.length; i++) {
			a[i] = Math.random()*100-50;
		}
		
		for (int i=0; i<a.length; i++) {
			if(a[i]>0)
				p++;
			if(a[i]<0)
				n++;
			if(a[i]==0)
				z++;
		}
		
		System.out.println("В массиве "+p+" положительных, "+n+" отрицательных и "+z+" нулевых элементов.");

	}

}
