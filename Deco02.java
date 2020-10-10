package by.tce.jonline.module2;

/* Написать метод (методы) для нахождения наибольшего общего делителя
 * для четырех натуральных чисел
 */

public class Deco02 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int val;
				
		a=(int)(Math.random()*50)+1;
		b=(int)(Math.random()*50)+1;
		c=(int)(Math.random()*50)+1;
		d=(int)(Math.random()*50)+1;
		
		val=Nod(Nod(a,b),Nod(c,d));
				
		System.out.println("Наибольший общий делитель для чисел "+a+", "+b+", "+c+" и "+d+" >> "+val);

	}
	
	private static int Nod(int a, int b) {
		int tmp;
		
		while(a!=0) {
			tmp=a;
			a=b%a;
			b=tmp;
		}
		return b;
	}

}
