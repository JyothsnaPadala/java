import java.util.Scanner;

public class ReverseApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scan.nextInt();
	Reverse reverse = new Reverse();
	int rev= reverse.ReverseNumber(n);
	System.out.println(rev);
	if(n==rev)
	{
		System.out.println("Entered number is a palindrome");
	}
	else 
	{
		System.out.println("Entered number is not a palindrome");
	}
}
}
