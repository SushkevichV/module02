package by.tce.jonline.module2;

/* Сортировка выбором. Дана последовательность a[1]<=a[2]<=...<=a[n]. 
 * Расположить элементы по убыванию.
 */

public class Sort3 {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for (int i=0; i<a.length; i++) {
			int max=a[i];
			int maxI=i;
			
			for (int j=i+1; j<a.length; j++) {
				if (a[j]>max) {
					max=a[j];
					maxI=j;
				}				
			}
			if (i!=maxI) {
				int tmp=a[i];
				a[i]=a[maxI];
				a[maxI]=tmp;
			}
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		

	}

}
