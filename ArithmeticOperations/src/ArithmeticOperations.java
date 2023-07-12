import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the first number : ");
		int num1=scan.nextInt();
		System.out.println("enter the second number : ");
		int num2=scan.nextInt();
		System.out.println("the subtraction is : "+subtractNumbers(num1,num2));
		
		System.out.println("the multiplication is : "+multiplyNumbers(num1,num2));
		System.out.println("the division is : "+"%.2f"+divideNumbers(num1,num2));
		System.out.println("the remainder is : "+findRemainder(num1,num2));
		

	}


public static int subtractNumbers(int num1,int num2)
{
	return num2- num1;
}

public static int multiplyNumbers(int num1,int num2)
{
	return num2*num1;
	
}
public static int divideNumbers(int num1,int num2)
{
	return num1/num2;
}
public static int findRemainder(int num1,int num2)
{
	return num1%num2;
	
}


}