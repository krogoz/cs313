package datastructuresproject;

public class CourseRoster {

	public Course course;
	public SortedLinkedList studentsRegistered = new SortedLinkedList();
	
	public CourseRoster(Course course) {
		this.course = course;
	}
	
	public void addStudent(Student student) {
		studentsRegistered.insertSorted(student);
	}
	
	public boolean findStudent(Student student) {
		return studentsRegistered.find(student);
	}
	
	public String toString() {
		return course.toString() + "studentsRegistered:\n" + studentsRegistered.toString();
	}
}
