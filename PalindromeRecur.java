
public class PalindromeRecur {

	public static void main(String[] args) {
		if(palindrom("a")){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}

	private static boolean palindrom(String s) {
		if(s.length()<=1){
			return true;
		}
		if(s.charAt(0)!=s.charAt(s.length()-1)){
			return false;
		}else{
			return palindrom(s.substring(1,s.length()-1));
		}
	}
}
