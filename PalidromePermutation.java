
public class PalidromePermutation {

	public static void main(String[] args) {
		
		String str = "tAct coa";
		
		if(isPermutationPalindrome(str)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		
	}

	private static boolean isPermutationPalindrome(String str) {
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		
		for(char c : str.toCharArray()){
			int x = getCharNumber(c);
			if(x != -1){
				table[x]++;
				if(table[x] %2 ==1){
					countOdd++;
				}else{
					countOdd--;
				}
			}
		}
		
		return countOdd <= 1;
	}

	private static int getCharNumber(char c) {
		
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int A = Character.getNumericValue('A');
		int Z = Character.getNumericValue('Z');
		
		int val = Character.getNumericValue(c);
		if(a <= val && val <=z){
			return val-a;
		}else if(A <= val && val <=Z){
			return val-A;
		}
		return -1;
	}
}
