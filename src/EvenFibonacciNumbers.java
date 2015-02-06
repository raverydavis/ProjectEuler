/**
 * Find the sum of even valued terms that do not exceed four million
 * in the Fibonacci sequence for Project Euler
 * Site: https://projecteuler.net/problem=2
 * 
 * @author Avery
 *
 */
public class EvenFibonacciNumbers {
	
	private static int LIMIT = 4000000; // Numbers from 1-4000000

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;		// Sum of the numbers
		int firstTerm = 1; 	// The starting point of fibonacci sequence.
		int secondTerm = 2;
		
		while (firstTerm < LIMIT) {
			int temp = firstTerm; // Store first term so it can be added to second.
			if (firstTerm % 2 == 0) {
				sum += firstTerm;
			}
			firstTerm = secondTerm;
			secondTerm += temp;
		}
		
		System.out.println("The sum is " + sum);
	}

}
