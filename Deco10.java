package by.tce.jonline.module2;

/* Дано натуральное число N. Написать метод (методы) для формирования массива, 
 * элементами которого являются цифры числа N.
 */
public class Deco10 {

	public static void main(String[] args) {
		int n = 651050184;
		int[] a = new int[count(n)];
		
		for(int i=a.length-1; i>=0; i--) {
			a[i]=n%10;
			n/=10;
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

	private static int count(int n) {
		int c=0;
		
		while (n>0) {
			n=n/10;
			c++;
		}
		return c;
	}

}
