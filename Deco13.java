package by.tce.jonline.module2;

/* Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (напр. 41 и 43).
 * Найти и напечатать все пары "близнецов" отрезка [n,2n], где n - заданное натуральное число больше 2. 
 */
public class Deco13 {

	public static void main(String[] args) {
		int n = 100;
		
		if (n>2) {
			for (int i=n; i<n*2-1; i++) {
				if(simple(i)==false) {
					if(simple(i+2)==false) {
						System.out.printf("%d и %d%n",i, i+2);
					}
				}
			}
		}

	}
	
	private static boolean simple (int i) {
		boolean tmp = false;
		
		for(int j=2; j<i; j++) { 	//перебираем делители в промежутке от 2 до i-1
			if(i%j==0) {
				tmp = true;
			}
		}
		
		return tmp;
	}

}
