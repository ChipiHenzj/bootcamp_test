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
		// TODO process passed values
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public int getID() {
		// TODO return required value
		return id;
	}

	public String getFirstName() {
		// TODO return required value
		return firstName;
	}

	public String getLastName() {
		// TODO return required value
		return lastName;
	}
}
