package util;

public class Calcutor {
	public static final double PI = 3.1459;
	
	public static double circumfernce(double radius) {

		return 2 * PI * radius;
	}

	public static double volume(double radius) {

		return 4.0  * PI * Math.pow(radius,3) / 3;
	}
}
