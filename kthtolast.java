
public class kthtolast {

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
	
	public int print(Node head ,int k){
		if(head == null) {
			return 0;
		}
			
		int index = print(head.next , k) +1;
		if(index == k){
			System.out.println(k + "th to last node is" + head.data);
		}
		
		return index;	
	}

	
	public static void main(String[] args){
		kthtolast list = new kthtolast();
		
		list.head = new Node(20);
		Node second = new Node(4);
		Node third = new Node(15);
		Node fourth = new Node(35);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		
		list.printList();
		
		int index = list.print(list.head,2);
		System.out.println("index :" + index);
	
	}//end of main	
}
