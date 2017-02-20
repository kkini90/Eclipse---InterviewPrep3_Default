import java.util.Stack;

public class Palindrome_Stack {

	static Node head;
	
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
	
	public static void main(String[] args){
		Palindrome_Stack list = new Palindrome_Stack();
		
		list.head = new Node(0);
		Node second = new Node(1);
		Node third = new Node(1);
		Node fourth = new Node(0);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		
		list.printList();
		if(list.isPalindrome(list)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		
	
	}//end of main	

	private boolean isPalindrome(Palindrome_Stack list) {
		Palindrome_Stack slow = head;
		Palindrome_Stack fast = list.head;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast!= null && fast )
		return true;
	}
}
