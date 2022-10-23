package datastructuresproject;

public class StudentRecord implements Comparable<StudentRecord> {

	public Student student;
	public Course courses[] = new Course[4];
	
	public StudentRecord(Student student, Course courses[]) {
		this.student = student;
		this.courses = courses;
	}
	
	public StudentRecord(Student student) {
		this.student = student;
	}
	
	public Course[] enroll(CourseRoster courseRoster) {
		// add course to courses
		for (int i = 0; i<4; i++) {
			if (courses[i] == null) {
				courses[i] = courseRoster.course;
				break;
			}
		}
		// add student to course roster
		courseRoster.studentsRegistered.insertSorted(student);
		return courses;
	}
	
	public Course[] drop(CourseRoster courseRoster) {
		// remove course to courses
		for (int i = 0; i<4; i++) {
			if (courses[i].equals(courseRoster.course)) {
				courses[i] = null;
				break;
			}
		}
		// remove student to course roster
		courseRoster.studentsRegistered.remove(student);
		return courses;
	}
	
	public boolean findCourse(Course course) {
		for(int i = 0; i<4; i++)
			if (courses[i] != null && courses[i].equals(course))
				return true;
		return false;
	}
	
	/**
     * Converts StudentRecord into printable String.
     */
	public String toString() {
		String string = student.toString() + "courses: ";
		for(int i=0; i<courses.length; i++)
			if (courses[i] != null)
				string+=courses[i].id + ",";
		if (string.endsWith(","))
			string = string.substring(0, string.length()-1);
		return string+"\n";
	}
	
	public int compareTo(StudentRecord other) {
		return student.compareTo(other.student);
    }

}

/**
 * 
Scanner scanner = new Scanner(System.in);
// Read the names of persons from the user
while (true) {
    System.out.print("Enter a name, empty will stop: ");
    String name = scanner.nextLine();
    if (name.isEmpty()) {
        break;
    }


    // Add to the list a new person
    // whose name is the previous user input
    persons.add(new Person(name));
}
 */
