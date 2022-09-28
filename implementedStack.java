package basicStructures;

public class implementedStack {

	
public static class Stack{
		
		Node top;
		
	public Stack() {
		this.top = null;
		
	}
	
	public void push(int value) {
		
		Node insertingNow = new Node(value);
		insertingNow.under = top;
		top = insertingNow;
		
	}
	
	public int pop() {
		int removingNow;
		
		if(top != null) {
		removingNow = top.value;
		top = top.under;
		
		}else{
			removingNow = -1;
			System.out.print("isEmpty\n");
				}
		
		
		return removingNow;
		
			}
		
	}
	
public static class Node{
	
	int value;
	Node under;
	
	public Node(int value) {
		
		this.value = value;
		this.under = null;
		
	}
	
}
	
}
