package datastructuresproject;

public class SortedLinkedList {
	
	public LLNode head;

	public SortedLinkedList() {
		head = new LLNode();
	}
	
	public boolean isEmpty() {
		return head.next == null;
	}
	
	public void insertSorted(Student x) {
		LLNode curr = head.next;
		LLNode prev = head;
		while ((curr != null) && ((Student) x).compareTo((Student) curr.data) > 0) {
			prev = curr;
			curr = curr.next;
		}
		curr = new LLNode(x, curr);
		prev.next = curr;
	}
	
	public void insertSorted(StudentRecord student) {
		LLNode curr = head.next;
		LLNode prev = head;
		while ((curr != null) && ((StudentRecord) student).compareTo((StudentRecord) curr.data) > 0) {
			prev = curr;
			curr = curr.next;
		}
		curr = new LLNode(student, curr);
		prev.next = curr;
	}
	
	public void remove(Student student) {
		LLNode curr = head.next;
		LLNode prev = head;
		while ((curr != null) && ((Student) student).compareTo((Student) curr.data) != 0) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = curr.next;
	}
	
	public void remove(StudentRecord studentRecord) {
		LLNode curr = head.next;
		LLNode prev = head;
		while ((curr != null) && ((StudentRecord) studentRecord).compareTo((StudentRecord) curr.data) != 0) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = curr.next;
	}
	
	public boolean find(Student student) {
		LLNode p = head.next;
		while (p != null) {
			if (p.data.equals(student))
				return true;
			p = p.next;
		}
		return false;
	}
	
	public boolean find(StudentRecord studentRecord) {
		LLNode p = head.next;
		while (p != null) {
			if (p.data.equals(studentRecord))
				return true;
			p = p.next;
		}
		return false;
	}
	
	public String toString() {
		String string = "";
		LLNode curr = head.next;
		while (curr != null) {
			string += curr.data.toString() + "\n";
			curr = curr.next;
		}
		return string;
	}
}
