package galacticArithmetic;

import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("the two numbers are ");
		long a= scan.nextLong();
		long b= scan.nextLong();
		System.out.println(galacticAddition(a,b));

	}
	public static long galacticAddition(long num1,long num2)
	{
		return num1+num2;
	}

}

