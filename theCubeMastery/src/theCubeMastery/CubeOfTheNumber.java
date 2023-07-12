package theCubeMastery;

import java.util.Scanner;

public class CubeOfTheNumber {
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
		int a = scan.nextInt();
		System.out.println("the cube of the number is "+cubeNumber(a));
	}
	
	public static int cubeNumber(int num)
	{
		return num*num*num;
	}

}
