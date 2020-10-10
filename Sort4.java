package by.tce.jonline.module2;

/* Сортировка обменом. Дана последовательность a[1]<=a[2]<=...<=a[n]
 * Отсортировать по возрастанию
 */

public class Sort4 {

	public static void main(String[] args) {
		int[] a = new int[] {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		int count = 0;
		
		for(int i=a.length-1; i>0; i--) {
			for(int k=0; k<i; k++) {
				if (a[k]>a[k+1]) {
					int tmp=a[k];
					a[k]=a[k+1];
					a[k+1]=tmp;
					count++;
				}
			}
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.printf("%nПроизведено %d перестановок", count);

	}

}
