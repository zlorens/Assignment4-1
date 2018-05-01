/* Zeke Lorens
   Recursion Assignment
   Help by Kyrrah
   
   Constructs a symmetric sequence of num numbers
   composed of DESCENDING integers ending in 1
   followed by a sequence of ASCENDING integers beginning with 1
   
   This only tests for when num equals 10
   I could have allowed a user to select num's value
*/

public class RecursionTest {

	public static void main(String[] args) {
		int num = 10;
		String spaces;
		
		for(int i = 1; i <= num; i++) {
			if (i < num) {
				spaces = " ";
			} else {
				spaces = "";
			} // end if-else
			
			// spaces line up the output
			System.out.println("Method " + spaces + i + ": " + writeSequence(i));
		} // end for	
	} // end main method
	
	private static String writeSequence(int n) {		
		if(n < 0) {
			throw new IllegalArgumentException();
		} else if(n == 1) {
			return "1";
		}
		
		else if (n == 2) {
			return "1 1";
		}
		
		// Kyrrah added the following code
		else if (n % 2 == 0) {
			// positive number
			return (n/2) + " " + writeSequence(n-2) + " " + (n/2);
		} else {
			// negative number
			return (n/2+1) + " " + writeSequence(n-2) + " " + (n/2+1);
		}
	} // end writeSequence method
} // end RecursionTest