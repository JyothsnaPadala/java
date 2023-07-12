package shadowingProblem;

import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
	   Scanner scan =  new Scanner(System.in);
	   System.out.println("enter id : ");
	   int id = scan.nextInt();
	   scan.nextLine();
	   System.out.println("enter the name : ");
	   String name = scan.nextLine();
	   System.out.println("enter gender : ");
	   String gender = scan.nextLine();
	   System.out.println("enter email : ");
	   String email = scan.nextLine();
	   System.out.println("enter the phone number : ");
	   long phone = scan.nextLong();
	   
	   Person p =new Person(id, name, gender, email, phone);
	   System.out.println("the name of the person with id " +p.id+" is "+p.name+" whose gender is "+p.gender+", registered mail id is "+p.email+" and contact number "+p.phone);
	   
	   

	}

}
