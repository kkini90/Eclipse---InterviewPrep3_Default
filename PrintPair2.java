
public class PrintPair2 {
	//O(nlgn) with O(1) space
	public static void getPairs(int[] input, int sum)
	{	
		if(input.length<2){
			System.out.println("Length is less than 2");
			
		}
		java.util.Arrays.sort(input);
		int start = 0;
		int end = input.length-1;

		while(start<end)
		{
			if(input[start]+input[end] == sum){
				System.out.println(input[start] +","+input[end]);
				start++;
				end--;
			}else if(input[start]+input[end] <  sum){
		           start++;
			}else{
	        	   end--;
	           }
		}
		
		System.out.println("Does not make the target");
		
	}
	public static void main(String[] args) {
		int[] input = new int[]{1,2,3};
		int sum =7;
		PrintPair2.getPairs(input, sum);

	}

}
