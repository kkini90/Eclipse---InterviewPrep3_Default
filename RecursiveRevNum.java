
public class RecursiveRevNum {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(reverseNumber(123, sb));
	}

	private static int reverseNumber(int number, StringBuilder sb) {
		if (number < 10) {
			sb.append(number);
			return Integer.parseInt(sb.toString());
		} else {
			sb.append(number % 10);
			return reverseNumber(number / 10, sb);
		}
	}
}
