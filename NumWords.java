// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) 
	{
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		int hundreds = num / 100;
		int tens = (num % 100) / 10;
		int ones = num % 10;
		String output = hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.";
		System.out.println(output);



	}
}
