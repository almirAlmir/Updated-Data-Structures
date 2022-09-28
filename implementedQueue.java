package basicStructures;

public class implementedQueue {
	
	
	public static void main(String[] args) {
		
		
	}

	
	public static class Node{
		
		private Object object;
		private Node next;
		
		public Node(Object object) {
			this.object = object;
			this.next = null;
			
		}

		public Object getObject() {
			return object;
		}

		public void setObject(Object object) {
			this.object = object;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [object=" + object + "]";
		}
		
	}
	
	public static class Queue{
		
		private Node end;
		private int size;
		
		public Queue() {
			
			this.end = null;
			this.size = 0;
			
		}
		
		public boolean isEmpty() {
			
			return this.size==0? true : false;
		}
		
		public void enqueue(Node no) {
				
			no.setNext(end);
			this.end = no;
			this.size++;
		}
		
		public void dequeue() {
			if(this.size > 1) {
				Node removingNow = end;
				Node aux = end;
				
				while(true) {
					
					if(removingNow.next == null) {
						
						aux.next = null;
						break;
					}
					else {
						
						aux = removingNow;
						removingNow = aux.next;
					}
					
				}
				this.size--;
				Object obj = removingNow.getObject();
				System.out.println("Content in the removed node: "+obj);
				
				
			}else {
				switch(this.size) {
				
				case 1:
					this.size--;
					Object obj = end.getObject();
					System.out.println("Content in the removed node: "+obj);
					this.end = null;
					
					
					break;
				case 0:
					System.out.println("Totally empty Queue!!! Invalid operation");
					break;
			}
			}
			
		}

	
		
		
		
	}
	
	
	
}
