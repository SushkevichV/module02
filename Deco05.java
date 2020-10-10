package by.tce.jonline.module2;

// Составить программу, которая в массиве A[N] находит второе по величине число

public class Deco05 {

	public static void main(String[] args) {
		int n = 10;
		int[] a = new int[n];
				
		System.out.println("Заданный массив:");
		for(int i=0; i<n; i++) {
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		
		System.out.printf("%n%nВторое по величине число - %d", Max2(a));
		
	}

	private static int Max2(int[] a) {
		int max = a[0];
		int max2 = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
			if(a[i]<max && a[i]>max2) {
				max2=a[i];
			}
		}
		return max2;
	}

}
