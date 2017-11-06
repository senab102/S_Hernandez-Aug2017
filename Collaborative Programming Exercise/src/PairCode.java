
//Sena Hernandez

//October 9 2017
//APCS First Period
//This is a pair programming code that will take a string of numbers
//Print out the largest, smallest, and the total of even, and the largest even number

import java.util.*;


public class PairCode {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("How many numbers? ");

	int num = input.nextInt();
	int sumEven = 0;
	int min = 0;
	int max = 0;
	int largestEven = 0;
	System.out.print("Enter a string of numbers seperated by spaces : ");
	for(int i = 0; i< num; i++){
		int Nextnum = input.nextInt ();
		if (i == 1) {
			min = Nextnum;
			max = Nextnum;
		}else {
			if(Nextnum<min) {
				min = Nextnum;
			}else if (Nextnum<max) {
				max = Nextnum;
			}
		}
		if(Nextnum %2 ==0) {
			if(Nextnum>largestEven) {
				largestEven = Nextnum;
			}
			sumEven += Nextnum;
		}
	}
	System.out.println("");
	System.out.println("The smallest number is: " + min);
	System.out.println("The largest number is: " + max);
	System.out.println("The total of even numbers are: " + sumEven);
	System.out.println("The largest even number is: " + largestEven);
}
}

	
