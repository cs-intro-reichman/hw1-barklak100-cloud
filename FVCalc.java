// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args)
	{
			// Replace this comment with your code
	double currentValue;
	double annualRatePercent;
	int years;
{
double principal = Double.parseDouble(args[0]);
double rate = Double.parseDouble(args[1]);
int years = Integer.parseInt(args[2]);
	double rate = annualRatePercent / 100.0;
	double base = 1.0 + rate;
	double power = Math.pow(base, years);
	double futureValueDouble = currentValue * power;
	int futureValueint = (int) futureValueDouble;
	System.out.printf("after %d years' $%.0f saved at %.1f%% will yield $%d%n");
}
	}
}