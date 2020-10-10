package by.tce.jonline.module2;

/* Даны две последовательности a[1]<a[2]<...<a[n] и a[1]<a[2]<...<a[m]. Образовать из них новую  
 * последовательность чисел так, чтобы она тоже была неубывающей. 
 * Дополнительный массив не использовать. 
 */

public class Sort2 {

	public static void main(String[] args) {
		int[] a = new int[] {1,3,4,6,8,9,10};
		int[] b = new int[] {0,2,5,7,11,12};
		int[] c = new int[a.length+b.length];
		int j=0;
		
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		
		for(int i=0; i<b.length; i++) {
			while(b[i]>c[j]&&j<a.length+i) {
				j++;
			}
			for(int k=c.length-2; k>=j; k--) {
				c[k+1]=c[k];
			}
			c[j]=b[i];
		}
		
		System.out.println("Объединенный массив:");
		for(int i:c) {
			System.out.print(i+" ");
		}
	}

}
