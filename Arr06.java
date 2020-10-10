package by.tce.jonline.module2;

import java.util.Random;

/*
 * Задана последовательность N вещественных чисел. 
 * Вычислить сумму чисел, порядкоые номера которых являются простыми числами.
 */

public class Arr06 {

	public static void main(String[] args) {
		double[] n = new double[20];
		Random x = new Random();
		boolean tmp;
		double sum;
		
		for(int i=0; i<n.length; i++) {
			n[i]=x.nextDouble()*20;
			System.out.println(n[i]);
		}
					
		sum = n[2]; //первое число массива, порядковый номер которого является простым числом
		
		for(int i=3; i<n.length; i++) {
			tmp = false;
			for(int j=2; j<i; j++) { 	//перебираем делители в промежутке от 2 до i-1
				if(i%j==0) { 			//если делитель найден, число в сумму не включаем
					tmp = true;
				}
			}
			if (tmp==false) {			//если делитель не найден, добавляем число к сумме
				sum+=n[i];
			}
		}
		
		System.out.println("Сумма чисел, порядковые номера которых являются простыми числами, равна "+sum);

	}

}
