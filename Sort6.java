package by.tce.jonline.module2;

/* Сортировка Шелла. Дан массив n действительных чисел. Отсортировать его по возрастанию,
 * сравнивая два соседних элемента.
 */
 
public class Sort6 {

	public static void main(String[] args) {
		double[] a = new double[] {1.2, 0.9, 14.8, 0.4, 6.7, 3.2, 15.3, 7.5, 2.8, 4.2};
		int i=0;
		
		while (i<a.length-1) {
			if (a[i]>a[i+1]) {
				double tmp=a[i];
				a[i]=a[i+1];
				a[i+1]=tmp;
				if (i>0)
					i--;
			}
			else
				i++;
		}
		
		for(double j:a)
			System.out.print(j+" ");

	}

}
