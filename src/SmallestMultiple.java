/**
 * Finds the smallest multiple for numbers 1-20 for Project Euler.
 * Site: https://projecteuler.net/problem=5
 * 
 * @author Avery
 *
 */
public class SmallestMultiple {
	
	private static int UPPER_LIMIT = 20; // Limit for numbers 1-20

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 100000; i < Integer.MAX_VALUE; i++) {
			if (checkMultiple(i)) {
				System.out.println("The number is " + i);
				break;
			}
		}
	}
	
	/**
	 * Check if the number is a multiple of numbers 1-20.
	 * 
	 * @param num the number to check
	 * @return true if the number is a multiple of numbers 1-20
	 */
	private static boolean checkMultiple(final int num) {
		int count = 0;
		for (int i = 2; i <= UPPER_LIMIT; i++) {
			if (num % i == 0) {
				count++;
			}
			
			if (count > 18) {
				return true;
			}
		}
		return false;
	}

}
