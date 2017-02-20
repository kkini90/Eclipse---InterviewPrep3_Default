import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NStringAnagram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of strings");
		int N = scanner.nextInt();
		System.out.println("Enter the strings");
		String[] str = new String[N];
		for(int i =0;i<N;i++){
			str[i] = scanner.next();
		}
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		
		for(String s : str){
			String key = sort(s);
			if(!map.containsKey(key)){
				map.put(key,new ArrayList<String>());
			}
			map.get(key).add(s);			
		}
		
		if(map.size()==1){
			System.out.println("List of words anagram");
		}else{
			System.out.println("List of words not anagram");
		}
	}
	private static String sort(String s) {
		char [] cArray = s.toCharArray();
		java.util.Arrays.sort(cArray);
		return(new String(cArray));		
	}
}
//https://www.careercup.com/question?id=5668114807128064


