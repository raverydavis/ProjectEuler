/**
 * Find the sum of all the multiples of 3 and 5 below 1000 for Project Euler
 * Site: https://projecteuler.net/problem=1
 * 
 * @author Avery
 *
 */
public class Multiples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 3; i < 1000; i ++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println("The sum is " + sum);
	}

}
