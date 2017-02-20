import java.util.Stack;

public class MyQueue<Integer> {
	
	Stack<Integer> stackNewest;
	Stack<Integer> stackOldest;
	
	public MyQueue(){
		stackNewest = new Stack<Integer>();
		stackOldest = new Stack<Integer>();
	}
	
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	
	public void add(Integer value){
		stackNewest.push(value);
	}
	
	private void shiftStacks(){
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public Integer peek(){
		shiftStacks();
		return stackOldest.peek();
	}
	
	public Integer remove(){
		shiftStacks();
		return stackOldest.pop();
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
//http://www.geeksforgeeks.org/implement-two-stacks-in-an-array/