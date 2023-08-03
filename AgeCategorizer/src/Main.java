import java.util.Scanner;

public class Main {
	public static void categorizeAge(int age) { 
		
			if(age>0 && age<=12)
			{
				System.out.println("The person who is aged "+age+" years is a Child");
			}
			else if(age>12 && age<19)
			{
				System.out.println("The person who is aged "+age+" years is a Teenager");
			}
			else if(age>19 && age<59)
			{
				System.out.println("The person who is aged "+age+" years is an Adult");
			}
			else
			{
				System.out.println("The person who is aged "+age+" years is a Senior");
			}
		} 
	
	
	
	
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of the person");
		int age = scan.nextInt();
		categorizeAge(age);
		} 
	
	}


