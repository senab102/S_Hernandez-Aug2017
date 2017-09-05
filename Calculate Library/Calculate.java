//Sena Hernandez
//September 5,2017
//This is our home grown library that will contain various mathematical methods.
public class Calculate {

	//This method takes an integer and returns its square.
	public static int square (int number) {
		return number * number;
	}
	//This method takes an integer and returns its cube.
	public static int cube (int number) {
		return number * number * number;
	}
	//This method takes a double and returns an average of the two numbers.
	public static double average (double number1, double number2) {
		return (number1 + number2 )/2;
	}
	//This method takes a double and returns an average of three numbers.
	public static double average (double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
	} 
	//This method converts an angle measure given in radians into degrees.
	public static double toDegree (double angle){
		return (angle * 180/3.14159);
	}
	//This method converts an angle measure given in degrees into radians.
	public static double toRadians (double radians) {
		return (radians * 3.14159/180);
	}
	//This method provides a coefficients of a quadratic equation in standard form and returns the value of the discriminant.
	public static double discriminant (double a, double b, double c) {
		return (b *b - 4 * a * c);
	}
	
}


 