
public class SecondLowest {

	public static void main(String[] args) {
		int[] array = new int[]{1,3,2};
		findSecondLowest(array);
	}
	
	private static void findSecondLowest(int[] array){
		if(array.length==0 || array == null){
			System.out.println("Length is zero or null");
			return;
		}
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int num : array){
			if(num < firstMin){
				secondMin = firstMin;
				firstMin =num;
			}else if(num < secondMin && firstMin != num ){
				secondMin = num;
			}
		}
		System.out.println("First minimum :" + firstMin);
		System.out.println("Second minimum :" + secondMin);
	}

}
