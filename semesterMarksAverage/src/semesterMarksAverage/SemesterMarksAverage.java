package semesterMarksAverage;

import java.util.Scanner;

public class SemesterMarksAverage {

	public static void main(String[] args) {
	   Scanner scan= new Scanner(System.in);
	   System.out.println("enter the marks of all the eight semesters ");
	   int a = scan.nextInt();
	   int b = scan.nextInt();
	   int c = scan.nextInt();
	   int d = scan.nextInt();
	   int e = scan.nextInt();
	   int f = scan.nextInt();
	   int g = scan.nextInt();
	   int h = scan.nextInt();
	   System.out.printf("the average marks of semester is "+"%.2f",semesterAverage(a,b,c,d,e,f,g,h));

	}
	public static double semesterAverage(int sem1,int sem2,int sem3,int sem4,int sem5,int sem6, int sem7,int sem8)
	{
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8.0 ;
	}
}
