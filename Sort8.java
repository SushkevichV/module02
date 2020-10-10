package by.tce.jonline.module2;

/* Даны дроби p1/q1, p2/q2, ..., p(n)/q(n) (p1, q1 - натуральные). Составить программу, которая
 * Приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class Sort8 {

	public static void main(String[] args) {
		int[] num = new int[] {7,5,3,4}; // числитель
		int[] den = new int[] {5,6,7,9}; // знаменатель
		int denom = den[0];
				
		for(int i=1; i<num.length; i++) { // определяем общий знаменатель (не обязательно наименьший)
			denom*=den[i];
		}
		
		for(int i=0; i<num.length; i++) { 
			num[i]=denom/den[i]*num[i];		// записывем соответствующий числитель
			den[i]=denom;					// записывем общий знаменатель
		}
		
		for(int i=num.length-1; i>0; i--) { // т.к. знаменатель одинаковый, сортируем только массив числителей
			for(int k=0; k<i; k++) {
				if (num[k]>num[k+1]) {
					int tmp=num[k];
					num[k]=num[k+1];
					num[k+1]=tmp;
				}
			}
		}
		
		System.out.println("Отсортированная последовательность дробей, приведенных к общему знаменателю:");

		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+"/"+den[i]+"   ");
		}
		
		for(int i=0; i<num.length; i++) { // Можно и сократить дроби для наглядности
			int tmp=0;
			int n=num[i];
			int d=den[i];
			
			while(n!=0) { // Ищем НОД
				tmp=n;
				n=d%n;
				d=tmp;
			}
			
			num[i]/=d;  // Сокращаем числитель
			den[i]/=d;  // и знаменатель
		}
		
		System.out.printf("%n%nОтсортированная последовательность сокращенных дробей:%n");
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+"/"+den[i]+"   ");
		}
		
	}

}
