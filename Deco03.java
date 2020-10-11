package by.tce.jonline.module2;

/* Вычислить площадь правильного шестиугольника со стороной a, используя метод
 * вычисления площади треугольника
 */

public class Deco03 {

	public static void main(String[] args) {
		int a;
		
		a=(int)(Math.random()*10);
		
		System.out.println("Площать правильного шестиугольника со стороной "+a+" равна "+ square(a)*6);

	}

	private static double square(int a) {
		double s;
		
		s=a*a*Math.sqrt(3)/4;
				
		return s;
	}

}
