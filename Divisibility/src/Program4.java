import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		Divisible5(n);
	}

		public static void Divisible5(int n)
		{
			for(int i=0;i<=n;i++)
			{
				if(i%5==0)
				{
					System.out.println(i);
				}
		}
	}
}
