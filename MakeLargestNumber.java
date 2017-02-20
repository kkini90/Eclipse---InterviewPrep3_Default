import java.util.Arrays;

public class MakeLargestNumber {

	public static void main(String[] args) {
		System.out.println("Largest number is " + solution(1452));

	}
	private static int solution (int N){
		if (N<0){
			return -1;
		}
		char[] digits = String.valueOf(N).toCharArray();
		if (digits.length>9){
			return -1;
		}
		Arrays.sort(digits);
		// needs to be in descending order
		for(int i = 0; i < digits.length / 2; i++) {
			char t = digits[i];
			digits[i] = digits[digits.length -i - 1];
			digits[digits.length -i - 1] = t;
		}
		int res =  Integer.parseInt(new String(digits));
		if (res>100000000){
			return -1;
		}
		return res;
	}
}
