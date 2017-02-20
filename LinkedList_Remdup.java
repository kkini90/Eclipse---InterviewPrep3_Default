
public class LinkedList_Remdup {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			data = d;
			next = null;
		}
	}//end of node class
	
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.println(n.data+ " ");
			n = n.next;
		}
	}
	
	public void deleteDups(Node n){
		Node current = n ;
		while(current != null){
			Node runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			
			current = current.next;
		}
		
	}
	
	public static void main(String[] args){
		LinkedList_Remdup list = new LinkedList_Remdup();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(3);
		Node fifth = new Node(4);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		list.printList();
		
		list.deleteDups(list.head);
		list.printList();
	}//end of main	
}
