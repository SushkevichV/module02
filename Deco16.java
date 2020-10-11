package by.tce.jonline.module2;

/* Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме.
 */

public class Deco16 {

	public static void main(String[] args) {
		int n=4;
		long sum=0;
		
		for(int i=(int)(Math.pow(10,n-1));i<Math.pow(10,n); i++) {
			if(oddNumber(i)>0) {
				sum+=i;
			}
		}
		
		System.out.println("Сумма "+n+"-значных чисел, содержащих только нечетные цифры равна "+sum);
		
		if(evenNumber(sum)>0) {
			System.out.println("Четных цифр в найденной сумме - "+evenNumber(sum));
		}
		else {
			System.out.println("Сумма не содержит четных цифр");
		}
		
		

	}

	private static int oddNumber(int i) {
		int n = i%10;
		
		i/=10;
		
		if(n%2>0) {
			if(i>0) {
				n=oddNumber(i);
			}
		}
		else {
			n=0;
		}
				
		return n;
	}
	
	private static int evenNumber(long sum) {
		int n=0;
		
		while(sum>0) {
			if(sum%2==0) {
				n++;
			}
			sum/=10;
		}
	
		return n;
	}


}
