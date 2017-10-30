import java.util.Arrays;
public class SplitCode {
	

	public static void main(String[] args) {

		// Your task Part 0
		//String.split();
		//Splitstring.split();
		//Where split is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//				it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
		//				it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples!".split("really")));
		System.out.println(Arrays.toString("I want to make apple pie!".split("pie")));
		System.out.println(Arrays.toString("I want pumpkins!".split(" want")));
		sandwich("applespineapplesbreadlettustomatobaconmayohambreadcheese");
	

	}
	//Your task:
	/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
	* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
	* What if it's a fancy sandwich with multiple pieces of bread?
	*/
		public static void sandwich(String everything) {
			//System.out.println(Arrays.toString("applespineapplesbreadlettustomatobaconmayohambreadcheese".split("bread")));
			//String sandwich = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
			System.out.println(Arrays.toString(everything.split("bread")));
		}


	//Your task pt 2:
	/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
	* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
	* Again, what if it's a fancy sandwich with multiple pieces of bread?
	*/



	}


