import java.util.Scanner;

public class Factor {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to find the factors");
	int n = scan.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println("The number "+i+" is a factor of "+n);
		}
	}
}
}
