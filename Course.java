package datastructuresproject;

public class Course implements Comparable<Course> {

	public String id;
	public String name;
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 */
	public Course(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
     * Compares this object to other.
     * 
     * @param other - Some other Coarse object.
     */
    public int compareTo(Course other) {
    	return other.id.compareTo(other.id);
    }
    
    /**
     * Converts Course into printable String.
     */
    public String toString() {
    	return "id: "+ id +"\nname:"+ name +"\n";
    }
}
