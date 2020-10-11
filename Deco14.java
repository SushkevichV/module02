package by.tce.jonline.module2;

/* Натуральное число, в записи которого n цифр, называется числом Армстронга, 
 * если сумма его цифр, возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k.
 */

public class Deco14 {

	public static void main(String[] args) {
		int k = 10000;
		
		System.out.println("Числа армстронга от 1 до "+k);
		
		for(int i=1; i<=k; i++) {
			if(arm(i)==i) {
				System.out.println(i);
			}
		}

	}

	private static int arm(int i) {
		int sum = 0;
		int n = 0 ;
		
		while (i>0) {
			sum+=i%10;
			i=i/10;
			n++;
		}
		return sum=(int)Math.pow(sum, n);
	}

}
