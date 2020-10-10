package by.tce.jonline.module2;

// Написать метод (методы), определяющий, в каком из данных двух числе больше цифр

public class Deco11 {

	public static void main(String[] args) {
		long n1 = 564631;
		long n2 = 654210654180095L;
				
		if(Tmp(n1)<Tmp(n2)) {
			System.out.printf("В числе %d больше цифр, чем в числе %d",n2, n1);
		}
		else {
			if(Tmp(n1)>Tmp(n2)) {
				System.out.printf("В числе %d больше цифр, чем в числе %d",n1, n2);
			}
			else {
				System.out.printf("В числах %d и %d одинаковое количество цифр",n1, n2);
			}
		}
		
		

	}

	private static int Tmp(long n) {
		int count=0;
		
		while (n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
