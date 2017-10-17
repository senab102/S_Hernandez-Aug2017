//Sena Hernandez
//October 12th, 2017
//This is a graph that describe the graph of a quadratic function.
public class Quadratic {
	public static String quardrDescriber(double a, double b, double c) {
		if (a == 0) {
			throw new IllegalArgumentException("not a quadratic function");
		}
		String output = "";
		output += "Description of the graph of: \n";
		output += "y =" + a + "x^2 + " + b + "x +" + c + "\n\n";
		output += Quadratic.direction(a, b, c);
		output += "\nAxis of Symmetry: ";
		output += Quadratic.axisofSym(a, b);
		output += "\nVertex: ";
		output += Quadratic.vertex(a, b, c);
		output += "\nx-intercept(s): ";
		output += Quadratic.quadForm(a, b, c);
		output += "\ny-intercept: " + c;
		return output;
	}

	public static String direction(double a, double b, double c) {
		if (a > 0) {
			return "Opens: Up";

		} else {
			return "Opens: Down";
		}
	}

	public static double axisofSym(double a, double b) {
		double axs = -b / (2 * a);
		return axs;
	}

	public static String vertex(double a, double b, double c) {
		double x = axisofSym(a, b);
		double y = a * x * x + b * x + c;
		return "(" + x + ", " + y + ")";
	}

	public static double discriminant(double a, double b, double c) {
		return (b * b - 4 * a * c);
	}

	public static double sqrt(double x) {
		double a = x / 2.0;
		while (absValue(x - a * a) > 0.005) {
			a = 0.5 * (x / a + a);
		}
		return round2(a);
	}

	public static double absValue(double number) {
		if (number > 0) {
			return number;
		} else {
			return number * -1;
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

	public static double max(double number1, double number2) {
		if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}

	public static double min(double number1, double number2) {
		if (number1 < number2) {
			return number1;
		} else {
			return number2;
		}
	}

	public static String quadForm(double x, double y, double z) {
		double disc = discriminant(x, y, z);
		if (disc < 0) {
			return "none";
		} else {
			double root1 = (-y - sqrt(disc)) / (2 * x);
			double root2 = (-y + sqrt(disc)) / (2 * x);
			if (root1 == root2) {
				return "" + round2(root1);

			} else {
				return round2(min(root1, root2)) + " and " + round2(max(root1, root2));
			}
		}
	}
}
