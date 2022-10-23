package datastructuresproject;

public class Registration {
	
	public static SortedLinkedList allStudentRecords = new SortedLinkedList();
	public static CourseRoster[] allCourseRosters = new CourseRoster[3];

	public static void main(String args[]) {
		Student student1 = new Student("1", "locke", "john");
		StudentRecord studentRecord1 = new StudentRecord(student1);
		allStudentRecords.insertSorted(studentRecord1);
		
		Student student2 = new Student("2", "deifel", "michael");
		StudentRecord studentRecord2 = new StudentRecord(student2);
		allStudentRecords.insertSorted(studentRecord2);
		
		Student student3 = new Student("3", "capritto", "micheal");
		StudentRecord studentRecord3 = new StudentRecord(student3);
		allStudentRecords.insertSorted(studentRecord3);
		
		Course course1 = new Course("1","CS313");
		CourseRoster courseRoster1 = new CourseRoster(course1);
		allCourseRosters[0] = courseRoster1;
		
		Course course2 = new Course("2","CS343");
		CourseRoster courseRoster2 = new CourseRoster(course2);
		allCourseRosters[1] = courseRoster2;
		
		Course course3 = new Course("3","CS320");
		CourseRoster courseRoster3 = new CourseRoster(course3);
		allCourseRosters[2] = courseRoster3;
		
		studentRecord2.enroll(courseRoster2);
		studentRecord1.enroll(courseRoster2);
		studentRecord2.drop(courseRoster2);
		studentRecord3.enroll(courseRoster1);
		studentRecord1.enroll(courseRoster1);
		
		if(studentRecord1.findCourse(courseRoster2.course)) {
			System.out.println("Course found!");
		} else {
			System.out.println("Course not found!");
		}
		
		if(courseRoster2.findStudent(student2)) {
			System.out.println("Student found!\n");
		} else {
			System.out.println("Student not found!\n");
		}
		
		System.out.println(allStudentRecords.toString());
		for(int i = 0; i<3; i++) {
			System.out.println(allCourseRosters[i]);
		}
		
	}
	
	
}
