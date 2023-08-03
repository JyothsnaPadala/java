import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		Divisible2(n);
	}

		public static void Divisible2(int n)
		{
			for(int i=0;i<=n;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
		}
	}
}
