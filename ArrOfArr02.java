package by.tce.jonline.module2;

/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */

public class ArrOfArr02 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		
		for(int i=0; i<a.length; i++) { 
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*10);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Диагональ от верхнего левого угла до нижнего правого");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if (i==j) {
					System.out.print(a[i][j]+" ");
				}
			}
		}	
		
		System.out.println();
		System.out.println("Диагональ от нижнего левого угла до верхнего правого");
		
		for(int i=a.length-1; i>=0; i--) {
			for(int j=0; j<a[i].length; j++) { 
				if ((a.length-i-1)==j) {
					System.out.print(a[i][j]+" ");
				}
			}
		}

	}

}
