

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,1,4,5,6};
		int[] array1 = new int[array.length];
		
		boolean[] flag = new boolean[array.length+1];
		for(int i =0;i<flag.length;i++){
			flag[i] = false;
		}
		int n= array.length;
		
		int j=0;
		for(int i=0;i<=n-1;i++){
			if(!flag[array[i]]){
				flag[array[i]] = true;
				array1[j++] = array[i];
				
			}
		}
		
		for(int i : array1){
			System.out.println(i);
		}					
	}
}
