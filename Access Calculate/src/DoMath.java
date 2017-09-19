//Sena Hernandez
//September 5, 2017
//This is the runner class for my Calculate Library methods
public class DoMath {

	public static void main(String[] args) { 
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average (5,10));
		System.out.println(Calculate.average(5, 10,12));
		System.out.println(Calculate.toDegree (3.14));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(25,3,7));
		System.out.println(Calculate.toImproperFrac(2, 1, 5));
		System.out.println(Calculate.toMixedNum(7,3));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(2,3));
		System.out.println(Calculate.absValue(5));
		System.out.println(Calculate.absValue(-5));
		System.out.println(Calculate.max(1,2));
		System.out.println(Calculate.max(1,2,3));
		System.out.println(Calculate.max(3,2,1));
		System.out.println(Calculate.max(1,3,2));
		System.out.println(Calculate.min(2,1));
		System.out.println(Calculate.round2(47.23568));
		System.out.println(Calculate.exponent(2,3));
		System.out.println(Calculate.factorial(3));
		System.out.println(Calculate.isPrime(5));
		System.out.println(Calculate.gcf(3,5));
		System.out.println(Calculate.gcf(6,12));
		System.out.println(Calculate.sqrt(9));
		
	}

}
