package by.tce.jonline.module2;

/* Сортировка вставками. Дана последовательность чисел a[1], a[2], ..., a[n].
 * Отсортировать в порядке возрастания с использованием двоичного поиска
 */

public class Sort5 {

	public static void main(String[] args) {
		int[] a = new int[] {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		
		for(int i=1; i<a.length; i++) {
			int k=a[i];
			int l=0;
			int h=i;

			l=serch(a, k, l, h);
			for (int j=i; j>l; j--) {
				a[j]=a[j-1];
			}
			a[l]=k;
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}

	}
	
	public static int serch(int[] a, int k, int j, int i) {
		int m;
		
		while (j<i) {
			m=j+(i-j)/2;
			if (k<a[m]) {
				i=m;
			}
			else {
				j=m+1;
			}
		}
		
		return j;
	}
	
}
