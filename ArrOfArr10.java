package by.tce.jonline.module2;

// Найти положительные элементы главной диагонали квадратной матрицы

public class ArrOfArr10 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*100)-50;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Положительные элементы главной диагонали: ");
		
		for(int i=0; i<a.length; i++) {
			if (a[i][i]>0) {
				System.out.print(a[i][i]+" ");
			}
		}

	}

}
