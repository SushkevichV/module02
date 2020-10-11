package by.tce.jonline.module2;

/* Написать методы нахождения наибольшего общего делителя и наименьшего общего кратного
 * двух натуральных чисел
 */

public class Deco01 {

	public static void main(String[] args) {
		int a;
		int b;
		
		a=(int)(Math.random()*10)+1;
		b=(int)(Math.random()*20)+1;
		
		System.out.println("Наибольший общий делитель для чисел "+a+" и "+b+" >> "+nod(a,b));
		System.out.println("Наименьшее общее кратное для чисел "+a+" и "+b+" >> "+nok(a,b));

	}

	private static int nok(int a, int b) {
		int val;
		
		val=a*b/nod(a,b);
		
		return val;
	}

	private static int nod(int a, int b) {
		int tmp;
		
		while(a!=0) {
			tmp=a;
			a=b%a;
			b=tmp;
		}
		return b;
	}

}
