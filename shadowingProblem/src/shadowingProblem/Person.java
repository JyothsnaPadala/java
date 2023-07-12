package shadowingProblem;

public class Person {

	int id;
	String name;
	String gender;
	String email;
	long phone;
	 
	void eat (String name)
	{
		System.out.println(name + " is eating");
	}
	void sleep (String name)
	{
		System.out.println(name + "  is sleeping");
	}
	public Person(int id, String name, String gender, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	
	


	}


