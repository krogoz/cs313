package datastructuresproject;

public class Student implements Comparable<Student> {

	public String firstName;
	public String lastName;
	public String id;
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param lastName
	 * @param firstName
	 */
	public Student(String id, String lastName, String firstName) {
		this.firstName = firstName.toLowerCase();
		this.lastName = lastName.toLowerCase();
		this.id = id;
	}
	
	/**
     * Converts this object into a printable String.
     */
	public String toString() {
		return "id: "+ id +"\nlastName: "+ lastName +"\nfirstName: " + firstName + "\n";
	}
	
	/**
     * Compares this object to other.
     * 
     * @param other - Some other Student object.
     */
	public int compareTo(Student other) {
		if (lastName.compareTo(other.lastName) == 0)
			return firstName.compareTo(other.firstName);
		else
			return lastName.compareTo(other.lastName);
    }
}
