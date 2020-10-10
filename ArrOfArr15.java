package by.tce.jonline.module2;

// Найдите наибольший элемент матрицы и замените все нечетные элементы на него

public class ArrOfArr15 {

	public static void main(String[] args) {
		int[][] a = new int[10][10];
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*10);
			}
		}
		
		int max = a[0][0];
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) { 
				if (a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		
		// Считаем, что нечетным элементом является элемент	с нечетным порядковым номером каждой строки
		// Если требуется заменить элементы только в нечетных строках, заменить
		// следующую строку на for(int i=1; i<a.length; i+=2)
		for(int i=0; i<a.length; i++) {			 
			for (int j=1; j<a[i].length; j+=2) { 	
				a[i][j]=max;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
