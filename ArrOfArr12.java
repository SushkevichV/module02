package by.tce.jonline.module2;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов

public class ArrOfArr12 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) { 
				a[i][j]=(int)(Math.random()*10);
			}
		}
			
		for (int i=0; i<a.length; i++) {
			if (i%2==0) {
				a[i]=sortMax(a[i]);
			}
			else {
				a[i]=sortMin(a[i]);
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static int[] sortMax(int[] a) {
		for (int i=0; i<a.length; i++) {
			int min=a[i];
			int minI=i;
			
			for (int j=i+1; j<a.length; j++) {
				if (a[j]<min) {
					min=a[j];
					minI=j;
				}				
			}
			if (i!=minI) {
				int tmp=a[i];
				a[i]=a[minI];
				a[minI]=tmp;
			}
		}
		
		return a;
		
	}

	private static int[] sortMin(int[] a) {
		
		for (int i=0; i<a.length; i++) {
			int max = a[i];
			int maxI = i;
			
			for(int j=i+1; j<a.length; j++) {
				if (a[j]>max) {
					max=a[j];
					maxI=j;
				}
			}
			if (i!=maxI) {
				int tmp = a[maxI];
				a[maxI]=a[i];
				a[i]=tmp;
			}
		}
		
		return a;
		
	}

}
