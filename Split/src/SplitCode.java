import java.util.*;
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
	private static void sandwich(String string) {
		// TODO Auto-generated method stub
		
	}

	//Your task:
	/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
	* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
	* What if it's a fancy sandwich with multiple pieces of bread?
	*/
	
		public static void everything (String sandwich){
			String [] breadArray = sandwich.split("bread");
			if (breadArray.length <= 2){
				System.out.println("Not a sanwich");
			}else{
			for (int i = 1;  i <breadArray.length; i++){
				String breadMiddleStatement = breadArray [i];
				System.out.println("Between pieces of bread is : " + breadMiddleStatement);
			}
			}
		}

		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		* Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/



		public static void everythingSpace(String sandwich){
			String [] sandwichNum2 = sandwich.split("bread");
			if (sandwichNum2.length <= 2){
				System.out.println("Not a sandwich");
			}else{
				if(sandwichNum2[1].equals("")){
					System.out.println("Not a sandwich");
				}else{
				for (int i = 1; i < sandwichNum2.length-1; i++){
					String insideBread = sandwichNum2[i];
					System.out.println("Between pieces of bread is: " + insideBread);
				}
				}
			}
		}



	


	}


