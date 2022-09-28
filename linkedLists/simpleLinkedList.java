package linkedLists;


public class simpleLinkedList {



public static class List{
	
	private String content;
	private List next;
	
	public List(String element){
		this.content = element;
		this.next = null;
	}
	
	public void addElement(String e) {
		
		if(this.next == null) {
			this.next = new List(e);
			
		}else {
			
			this.next.addElement(e);
		}
		
	}
	
	public void imprimir() {
	
		String e = this.content;
		System.out.println(e+" ");
		
		if(this.next!=null) {
			this.next.imprimir();
	
		}
		
	}

	
}




}
