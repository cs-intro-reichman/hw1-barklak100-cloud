// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

		int number;

		number = Integer.parseInt(args[0]);

		int hundreds = number / 100; 

		int remainder = number % 100;

		int tens = number / 10;

		int ones = remainder % 10;

		System.out.println(hundreds + "hundreds" + tens + "tens" + ones + "ones.");




	}
}
