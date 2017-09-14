//Sena Hernandez
//September 5, 2017
//This is the runner class for my Calculate Library methods
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average (5,10));
		System.out.println(Calculate.average(5, 10,12));
		System.out.println(Calculate.toDegree (10));
		System.out.println(Calculate.toRadians(12));
		System.out.println(Calculate.discriminant(25,3,7));
		System.out.println(Calculate.toImproperFrac(2, 1, 5));
		System.out.println(Calculate.toMixedNum(3,7));
		System.out.println(Calculate.foil(2, 5, 1, 4, "n"));
		
	}

}
