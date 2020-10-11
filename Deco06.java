package by.tce.jonline.module2;

// Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Deco06 {

	public static void main(String[] args) {
		int nod = 0;
		int[] a = new int[3];
		
		System.out.print("Числа ");
		for(int i=0; i<a.length; i++) {
			a[i]=(int)(Math.random()*50)+2;
			System.out.print(a[i]+" ");
		}
		
		nod = nod(nod(a[0],a[1]),a[2]);
				
		if (nod>1) {
			System.out.println("не являются взаимно простыми.");
		}
		else {
			System.out.println("являются взаимно простыми.");
		}

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
