package datastructuresproject;


public class LLNode<Item> {
	
	public Item data;
	public LLNode next;

	/**
	 * Creates a node with data and a next node.
	 */
	public LLNode(Item data, LLNode next) {
		this.data = data;
		this.next = next;
	}
	
	/**
	 * Creates an empty (dummy) node.
	 */
	public LLNode() {
		this.data = null;
		this.next = null;
	}
	
	/**
	 * Creates a node with data that doesn't point to
	 * a next node.
	 */
	public LLNode(Item data) {
		this.data = data;
		this.next = null;
	}
}