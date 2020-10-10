package by.tce.jonline.module2;

/* На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие, 
 * между какими из пар точек самое большое расстояние.
 * Координаты точек занести в массив.
 */

public class Deco04 {

	public static void main(String[] args) {
		double max;
		int point1 = 0;
		int point2 = 0;
		int n;
		n=(int)(Math.random()*10)+3; // Количество точек не менее трех
				
		int[][] a = new int[2][n];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*20);
			}
		}
		
		System.out.println("Заданы точки с координатами:");
		for(int i=0; i<n; i++) {
			System.out.print("A"+(i+1)+"("+a[0][i]+";"+a[1][i]+")  "); // Элемент с индексом 0 - абсцисса, 1 - ордината
		}
	
		max = Dist(a[0][0],a[0][1], a[1][0], a[1][1]);
	    
		for(int i = 0; i < n; i++) {
	        for(int j = i+1; j<n; j++) {
	        	double tmp;
	            tmp=Dist(a[0][i], a[0][j], a[1][i], a[1][j]);
	            if(tmp>max) {
	            	max = tmp;
	            	point1 = i;
	            	point2 = j;
	            }
	        }
	    }
		
		System.out.printf("%n%nНаибольшее расстояние между точками A%d и A%d >> %f", point1+1, point2+1, max);
	    
	}

	private static double Dist(int x1, int x2, int y1, int y2) {
		double dist;
		
		dist = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		return dist;
	}

}
