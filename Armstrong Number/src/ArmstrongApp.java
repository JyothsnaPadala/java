import java.util.Scanner;

public class ArmstrongApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scan.nextInt();
	Armstrong armstrong = new Armstrong();
	double res=armstrong.ArmstrongChecker(n);
	System.out.println(res);
	}
}
