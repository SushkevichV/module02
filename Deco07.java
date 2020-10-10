package by.tce.jonline.module2;

// Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Deco07 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<10; i+=2) {
			sum+=fact(i);
		}
		
	System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна "+sum);	

	}

	private static int fact(int i) {
		int val=1;
		
		for(int j=1; j<=i; j++) {
			val*=j;
		}
		
		return val;
	}

}
