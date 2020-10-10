package by.tce.jonline.module2;

/* Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод (методы) вычисления
 * его площади, если угол между сторонами X и Y прямой.
 */

public class Deco09 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int t;
		double s1;
		double s2;
		double d;
		
		x=(int)(Math.random()*10)+2;
		y=(int)(Math.random()*10)+2;
		z=(int)(Math.random()*10)+2;
		t=(int)(Math.random()*10)+2;
		
		d=Math.sqrt(x*x+y*y); //диагональ
		s1=Square(x,y,d);
		s2=Square(z,t,d);
		System.out.printf("Площадь четырехугольника со сторонами %d, %d, %d, %d равна %f", x,y,z,t,s1+s2);


	}

	private static double Square(int x, int y, double d) {
		double p;
		double val;
		
		p=(x+y+d)/2;
		val=Math.sqrt(p*(p-x)*(p-y)*(p-d)); 
		val=Math.round(val*1000000);		// округлил до шести знаков
		val=val/1000000;
		return val;
	}

}
