/**
 * Answer problem number 6 from the Project Euler website.
 * Site: https://projecteuler.net/problem=6
 * 
 * @author Avery
 * 
 */

public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int upper = 100; 	// How many numbers we add up.
		int sq1 = 0;			// The sum of the squares of first 100 numbers
		int sq2 = 0;			// The square of the sum of first 100 numbers
		
		for (int i = 1; i <= upper; i++) {
			sq1 += square(i);
			sq2 += i;
		}
		
		int sum = square(sq2);
		System.out.println("The difference of " + sum + " - " + sq1 + " = " + (sum - sq1));
	}
	
	/**
	 * Squares a number.
	 * 
	 * @param num what number to square
	 * @return return the square of num
	 */
	private static int square(final int num) {
		return num*num;
	}

}
