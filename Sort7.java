package by.tce.jonline.module2;

/* Даны две неубывающие последовательности a и b. Требуется указать те места, на которые 
 * нужно вставлять элементы последовательности b в последовательность a так, чтобы
 * новая последовательность оставалась возрастающей
 */

public class Sort7 {

	public static void main(String[] args) {
		int[] a = new int[] {1,3,4,6,8,9,10,13};
		int[] b = new int[] {2,5,7,11,12};
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
			c[j]=0; // Указатель
		}
		
		System.out.println("Последовательность a, где через 0 указаны места для вставки элементов последовательности b");
		for(int i:c) {
			System.out.print(i+" ");
		}
		
		System.out.printf("%n%nИли таким образом:%n");
		
		j=0;
		for(int i=0; i<c.length; i++) {
			if (c[i]==0) {
				System.out.printf("Место для элемента b[%d]%n",j);
				j++;
			}
			else {
				System.out.println(c[i]);
			}
		}
				
	}

}
