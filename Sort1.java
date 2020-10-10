package by.tce.jonline.module2;

/* Заданы два простых массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого,
 * при этом не используя дополнительный массив
 */

public class Sort1 {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] b = new int[] {21,22,23,24,25};
		int k = 3;
		int[] c = new int[a.length+b.length];
		
		for(int i=0; i<=k; i++) {
			c[i]=a[i];
		}
		
		for(int i=0; i<b.length; i++) {
			c[i+k+1]=b[i];
			}
		
		for(int i=k+1; i<a.length; i++) {
			c[i+b.length]=a[i];
		}
		
/* Закомментирован код объединения массивов без создания нового массива.
 * Как выяснилось, новый массив создавать все же можно.
		a=java.util.Arrays.copyOf(a, a.length+b.length);
		for(int i=a.length-b.length-1; i>k; i--)
			a[i+b.length]=a[i];
		System.arraycopy(b, 0, a, k+1, b.length);
*/				
		for (int i:c) {
			System.out.print(i+" ");
		}
				
	}

}
