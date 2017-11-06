
//Sena Hernandez
//October 12th, 2017
//This is a graph that describe the graph of a quadratic function.

import java.util.*;

public class QuadraticClient {
	public static void main(String args[]) {
		boolean done = false;
		Scanner scanner = new Scanner(System.in);
		while (!done) {
			System.out.println("provide values for coefficients a, b, and c");
			System.out.print("a: ");
			double a = scanner.nextDouble();
			System.out.print("b: ");
			double b = scanner.nextDouble();
			System.out.print("c: ");
			double c = scanner.nextDouble();
			System.out.println();
			System.out.println(Quadratic.quardrDescriber(a, b, c));
			System.out.println("\ndo you want to keep going? (Type \"quit\" to end)");
			String finished = scanner.next();
			if (finished.equals("quit")) {
				done = true;
			}
		}
		scanner.close();
	}
}
