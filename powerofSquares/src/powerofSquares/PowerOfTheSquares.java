package powerofSquares;

import java.util.Scanner;

public class PowerOfTheSquares {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("the number to be squared is : ");
	int a  = scan.nextInt();
	System.out.println("the square of the given number is "+squareNumber(a));

	}
	public static int squareNumber(int num)
	{
	return num*num ;
	}

}
