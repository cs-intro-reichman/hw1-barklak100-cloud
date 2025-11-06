import java.util.Random;
public class Ascend {
	public static void main(String[] args) {
int Lim = Integer.parseInt(args[0]);
Random rand = new Random();
int num1 = rand.nextInt(Lim);
int num2 = rand.nextInt(Lim);
int num3 = rand.nextInt(Lim);
System.out.println(num1 + " " + num2 + " " + num3);
int min12 = Math.min(num1, num2);
int a = Math.min(min12, num3);
int max12 = Math.max(num1, num2);
int c = Math.max(max12, num3);
int b = (num1 + num2 + num3) - a - c;
System.out.println(a + " " + b + " " + c);
	}
}
