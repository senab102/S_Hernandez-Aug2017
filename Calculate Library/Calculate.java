//Sena Hernandez
//September 5,2017
//This is our home grown library that will contain various mathematical methods.
public class Calculate {
//Part 1
	// This method takes an integer and returns its square.
	public static int square(int number) {
		return number * number;
	}

	// This method takes an integer and returns its cube.
	public static int cube(int number) {
		return number * number * number;
	}

	// This method takes a double and returns an average of the two numbers.
	public static double average(double number1, double number2) {
		return ((number1 + number2) / 2);
	}

	// This method takes a double and returns an average of three numbers.
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3) / 3;
	}

	// This method converts an angle measure given in radians into degrees.
	public static double toDegree(double angle) {
		return (angle * 180 / 3.14159);
	}

	// This method converts an angle measure given in degrees into radians.
	public static double toRadians(double radians) {
		return (radians * 3.14159 / 180);
	}

	// This method provides a coefficients of a quadratic equation in standard form
	// and returns the value of the discriminant.
	public static double discriminant(double a, double b, double c) {
		return (b * b - 4 * a * c);
	}

	public static String toImproperFrac(int coefficient, int numerator, int denominator) {
		return ((coefficient * denominator) + numerator) + "/" + denominator;
	}

	public static String toMixedNum(int numerator, int denominator) {
		return (numerator / denominator + "_" + numerator % denominator + "/" + denominator);
	}

	public static String foil(int number1, int number2, int number3, int number4, String variable) {
		return number1 * number3 + variable + "^2" + "+" + ((number1 * number4) + (number2 * number3)) + variable + "+"
				+ (number2 * number4);
	}
// Part 2
	public static boolean isDivisibleBy(int x, int y) {
		if (x % y == 0) {
			return (true);
		} else {
			return (false);
		}
	}

	public static double absValue(double number) {
		if (number > 0) {
			return number;
		} else {
			return number * -1;
		}
	}

	public static double max(double number1, double number2) {
		if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}

	public static double max(double number1, double number2, double number3) {
		if (number1 > number2) {
			if (number3 > number1) {
				return number3;
			} else {
				return number1;
			}
		} else {
			if (number3 > number2) {
				return number3;
			} else {
				return number2;

			}
		}
	}

	public static double min(double number1, double number2) {
		if (number1 < number2) {
			return number1;
		} else {
			return number2;
		}
	}

	public static double round2(double number1) {
		double result = 0.0;
		int tempInt = (int) (number1 * 1000);
		int roundNum = (tempInt % 10);
		tempInt = (tempInt / 10);
		if (roundNum >= 5 && tempInt > 0) {
			tempInt++;
		} else {
			if (roundNum <= -5 && tempInt < 0)
				;
			tempInt--;
		}
		result = tempInt / 100.0;
		return result;
	}
//Part 3
	public static double exponent(double number1, int power) {
		double result = 1.0;
		for (int i = 0; i < power; i++) {
			result = result * number1;
		}
		return result;
	}

	public static int factorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		return result;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (isDivisibleBy(n, i)) {
				return false;
			}
		}
		return true;
	}

	public static int gcf(int x, int y) {
		int result = 1;
		for (int i = 1; i <= min(x, y); i++) {
			if (isDivisibleBy(x, i) && isDivisibleBy(y, i)) {
				result = i;
			}
		}
		return result;
	}

	public static double sqrt(double x) {
		double a = x / 2.0;
		while (absValue(x - a * a) > 0.005) {
			a = 0.5 * (x / a + a);
		}
		return round2(a);
	}
	public static String quadForm (int x, int y, int z) {
		double disc = discriminant (x,y,z);
		if (disc < 0) {
			return "no real roots";
		}else {
			double root1 = (-y - sqrt (disc)) / (2 * x);
			double root2 = (-y + sqrt (disc))/ (2*x);
			if (root1 == root2) {
				return "" + round2(root1);

		} else {
			return round2 (min (root1, root2)) + " and " + round2(max(root1, root2));
		}
	}
}



	}



