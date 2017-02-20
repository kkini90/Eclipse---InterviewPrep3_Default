
public class add {

	public static void main(String[] args) {
		int[] array = new int[]{1,2,4,5};
		int sum  =0;
		int finalSum  = 6;
		for(int i =0;i<array.length;i++){
			sum += array[i];
			if(sum == finalSum){
				System.out.println("Sum make");
				break;
			}
		}
		
		
	}

}
