package main.java.org.activity13;

/**
 * @author student
 * 
 */
public class Teacher {

	private int id;
	private String firstName;
	private String lastName;

	public Teacher(int id, String firstName, String lastName) {
		// process passed values
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getID() {
		// return required value
		return id;
	}

	public String getFirstName() {
		// return required value
		return firstName;
	}

	public String getLastName() {
		// return required value
		return lastName;
	}
}
