package by.tce.jonline.module2;

/* Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и.т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль? 
 */

public class Deco17 {

	public static void main(String[] args) {
		int n=20;
		int count=0;
		
		System.out.println("Заданное число - "+n);
		while (n>0) {
			n=n-Sum(n);
			count++;
			System.out.println("Остаток от вычитания суммы цифр - "+n);
		}
		
		System.out.printf("Операция произведена %d раз(а).",count);

	}
	
	private static int Sum(int n) {
		int sum=0;
		
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
	
		return sum;
	}

}
