
public class Problems {
	/* http://algorithms.tutorialhorizon.com/check-if-one-binary-is-mirror-tree-of-another-binary-tree/
	 * http://algorithms.tutorialhorizon.com/tree-traversals/
	 * http://algorithms.tutorialhorizon.com/inorder-traversal-non-recursive-approach/
	 * http://algorithms.tutorialhorizon.com/binary-tree-preorder-traversal-non-recursive-approach/
	 * http://algorithms.tutorialhorizon.com/binary-tree-postorder-traversal-non-recursive-approach/
	 * http://algorithms.tutorialhorizon.com/search-the-element-in-a-binary-tree-with-and-without-recursion/
	 * http://algorithms.tutorialhorizon.com/print-the-binary-tree-in-vertical-order-path/
	 * http://algorithms.tutorialhorizon.com/breadth-first-searchtraversal-in-a-binary-tree/
	 * http://algorithms.tutorialhorizon.com/depth-first-searchtraversal-in-binary-tree/
	 * http://www.java2blog.com/2016/04/find-minimum-and-maximum-elements-in.html
	 * http://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/
	 * http://www.geeksforgeeks.org/implement-two-stacks-in-an-array/
	 * http://javarevisited.blogspot.com/2016/09/how-to-print-all-leaf-nodes-of-binary-tree-in-java.html
	 * http://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
	 * http://algorithms.tutorialhorizon.com/delete-the-binary-tree/
	 * http://algorithms.tutorialhorizon.com/find-the-max-element-in-a-given-binary-tree/
	 * http://www.programcreek.com/2014/05/leetcode-closest-binary-search-tree-value-java/
	 * http://codercareer.blogspot.com/2013/03/no-45-closest-node-in-binary-search-tree_2.html
	 * 
	 * Hash Map http://www.algolist.net/Data_structures/Hash_table/Simple_example (look chaining also)
	 * http://algorithms.tutorialhorizon.com/algorithms-hash-table-implementation/
	 * 
	 * factorial
	 * http://www.javawithus.com/programs/factorial
	 * 
	 * decimal to binary
	 * http://www.javawithus.com/programs/decimal-to-binary
	 * 
	 * String palidrome recursion
	 * http://beginnersbook.com/2014/01/java-program-to-check-palindrome-string-using-recursion/
	 * 
	 * bst node in given range
	 * http://www.geeksforgeeks.org/print-bst-keys-in-the-given-range/
	 * http://prpds.blogspot.com/2011/07/print-bst-keys-in-given-range.html
	 * 
	 * given a nested array, write a function and turns it into a single array. 
	 * http://stackoverflow.com/questions/20686499/java-how-to-convert-a-multidimensional-array-to-single-array-easily
	 * 
	 * JDBC
	 * http://cs-fundamentals.com/java-programming/java-jdbc-connection-tutorial.php
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	 
}

public class HashEntry{
	private int key;
	private int value;
	
	HashEntry(int key, int value){
		this.key = key;
		this.value = value;
	}	
	public int getKey(){
		return key;
	}	
   public int getValue(){
		return value;
	}
}
public class HashMap{
	HashEntry[] table ;
	private static final int  SIZE = 128;
	
	HashMap(){
		table = new HashEntry[SIZE];
		
		for(int i=0;i<SIZE;i++){
			table[i] = null;
		}
	}
	
	public int get(int key){
		int hash = key % SIZE;
		while(table[hash] != null && table[hash].getKey() != key){
			hash = (hash +1) %SIZE;
		}
		
		if(table[hash] == null){
			return -1;
		}else{
			return table[hash].getValue();
		}
	}
	
	public void put(int key, int value){
		int hash = key % SIZE;
		
		while(table[hash] != null && table[hash].getKey()!= key){
			hash = (hash +1) %SIZE;
		}
		table[hash] = new HashEntry(key,value);
	}
}
