package by.tce.jonline.module2;

/* Найти все натуральные n-значные числа, цифры в которых образуют
 * строго возрастающую последовательность (напр. 1234, 5789)
 */

public class Deco15 {

	public static void main(String[] args) {
		int n=4;
		
		System.out.println(n+"-значные числа, цифры которых образуют возрастающую последовательность:");
		
		for(int i=(int)(Math.pow(10,n-1));i<Math.pow(10,n); i++) {
			if(num(i)<10) {
				System.out.println(i);
			}
		}

	}

	private static int num(int i) {
		int n = i%10;
		
		if(i>0) {
			i/=10;
			if(n<=num(i)) {
				n=10;
			};
		}
		
		return n;
	}

}
