// Splits a restaurant bill evenly among three diners.
public class Bill3 {
public static void main(String[] args) {
			// To get you started, here is the first line in the program:
		String name1 = args[0];
			    // Replace this comment with the rest of your code   
	    String name2 = args[1];
		String name3 = args[2];
		int total_amount = Integer.parseInt(args[3]);
		double totalAmountDouble = (double) total_amount;
        double amountPerPersonExact = (double) total_amount / 3.0;
		double amountToPay = Math.ceil(amountPerPersonExact);
        String namesInReversOrder = name3 + name2 + name1;
		String outputMessage = "Dear " + namesInReversOrder + ": pay " + amountToPay + " Shekels each.";
		System.out.println(outputMessage); 
	}
}
	
		
