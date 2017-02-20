

public class DeleteMiddleNode {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
		
	}
	
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.println(n.data+ " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		DeleteMiddleNode n= new DeleteMiddleNode();
		n.head = new Node(20);
		Node second = new Node(4);
		Node third = new Node(15);
		Node fourth = new Node(35);
		
		n.head.next = second;
		second.next = third;
		third.next = fourth;
		
		n.printList();
		
		if(deleteNode(n.head)){
			System.out.println("Deleted");
		}else{
			System.out.println("Not Deleted");
		}
		
		n.printList();
		
	}
	private static boolean deleteNode(Node n) {
		if(n == null || n.next == null){
			return false;
		}
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}

}
