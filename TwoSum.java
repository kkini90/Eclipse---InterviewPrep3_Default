import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] res = twoSum(new int[]{3,2,4},6);
		for(int r :res){
			System.out.println(r);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    int[] ans = new int[2];
	    for (int i = 0; i < nums.length; i++) {
	        if (map.containsKey(target-nums[i])) {
	            ans[0] = i;
	            ans[1] = map.get(target-nums[i]);
	            return ans;
	        }
	        map.put(nums[i],i);
	    }
	    return ans;
	}
}
