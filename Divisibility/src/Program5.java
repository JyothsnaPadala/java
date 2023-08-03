import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		Divisible2And5(n);
	}

		public static void Divisible2And5(int n)
		{
			for(int i=0;i<=n;i++)
			{
				if(i%2==0 && i%5==0)
				{
					System.out.println(i);
				}
		}
	}
}
