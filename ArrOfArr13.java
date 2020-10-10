package by.tce.jonline.module2;

// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов

public class ArrOfArr13 {

	public static void main(String[] args) {
		int n=10;
		int[][] a = new int[n][n];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*10);
			}
		}
		
		for (int j=0; j<a[0].length; j++) {
			if(j%2==0) {
				for(int i=a.length-1; i>0; i--) {
					for(int k=0; k<i; k++) {
						if (a[k][j]>a[k+1][j]) {
							int tmp=a[k][j];
							a[k][j]=a[k+1][j];
							a[k+1][j]=tmp;
						}
					}
				}
			}
			else {
				for(int i=a.length-1; i>0; i--) {
					for(int k=0; k<i; k++) {
						if (a[k][j]<a[k+1][j]) {
							int tmp=a[k][j];
							a[k][j]=a[k+1][j];
							a[k+1][j]=tmp;
						}
					}
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
