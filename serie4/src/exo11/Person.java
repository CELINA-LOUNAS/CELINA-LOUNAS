package exo11;

public class Person {

	private String  lastName;
	private String firstName;
	
	public Person (String lastName, String firstName)
	{
		this.lastName=lastName;
		this.firstName=firstName;
	}

	public Person() {
		
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setPrenom(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + "]";
	}
	}


