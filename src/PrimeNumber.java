/**
 * Finds the 10001st prime number for Project Euler.
 * Site: https://projecteuler.net/problem=7
 * 
 * @author Avery
 *
 */
public class PrimeNumber {
	
	private static int PRIME_lIMIT = 10001; // 10001 prime number

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Best way to check if number is prime is to check with already known prime numbers.
		 */
		int count = 0;							// Keep track of the amount prime numbers.
		int primes[] = new int[PRIME_lIMIT]; 	// Storage for the prime numbers.
		for (int i = 2; i < Integer.MAX_VALUE; i++) {
			boolean prime = checkPrime(i, primes);
			if (prime) {
				primes[count] = i;
				count++;
				if (count == PRIME_lIMIT) {
					System.out.println("Limit = " + PRIME_lIMIT + " :" + i);
					break;
				}
			}
		}
	}
	
	/**
	 * Checks if a number is prime or not. Use a list of known primes
	 * for the fastest checking.
	 * 
	 * @param checkNum number to check if prime
	 * @param num list of already checked prime numbers
	 * @return if number is prime
	 */
	private static boolean checkPrime(final int checkNum, final int...num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 1) {
				return true;
			}
			
			if (checkNum % num[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
