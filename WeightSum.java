import java.util.Stack;

public class WeightSum {

	public static void main(String[] args) {
		int maxdepth = 10;
		int[] items_depth = new int[maxdepth + 1];
		int depth = 0;
		String str = "{1,{4,{1,3},5,6},2,3}";
		Stack<Integer> stack = new Stack<Integer>();

		int j = 0;
		while (j < str.length()) {
			char ch = str.charAt(j++);
			if (ch == '{') {
				depth++;
			}
			if (Character.isDigit(ch)) {
				items_depth[depth]++;
				String ii = String.valueOf(ch);
				stack.push(Integer.parseInt(ii));
			}
			if (ch == ',') {
				continue;
			}
			if (ch == '}') {
				int temp_depth = depth;
				depth--;
				int sum = 0;
				for (int k = 1; k <= items_depth[temp_depth] && items_depth[temp_depth] > 0; k++) {
					sum += stack.pop();
				}
				items_depth[temp_depth] = 0;
				stack.push(temp_depth * sum);
				items_depth[depth]++;
			}
		}
		System.out.println(stack.pop());
	}
}

/*
public class Solution {
	public int depthSum(List<NestedInteger> nestedList) {
		return depthSumHelper(nestedList, 1);
	}
	public int depthSumHelper(List<NestedInteger> nestedList, int level) {
		int result = 0;
		for (int i = 0; i < nestedList.size(); i++) {
			NestedInteger cur = nestedList.get(i);
			if (cur.isInteger() == true) {
				result += cur.getInteger() * level;
			} else {
				result += depthSumHelper(cur.getList(), level + 1);
			}
		}
		return result;
	}
}
*/
