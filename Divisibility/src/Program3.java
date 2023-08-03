import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		Divisible3(n);
	}

		public static void Divisible3(int n)
		{
			for(int i=0;i<=n;i++)
			{
				if(i%3==0)
				{
					System.out.println(i);
				}
		}
	}
}
