
public class Node {
	String data;
	Node next;
	
	public Node() {
	}
	
	public Node(String d, Node n) {
		setData(d);
		setNext(n);
	}
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
