
public class BinarySearchIterative {

	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5,6,7};		
		System.out.println(findKey(array,2));
	}
	
	private static int findKey(int[] array,int key){
		int low = 0;
		int high = array.length-1;
		
		while(low<=high){
			int mid =(low+high)/2;
			
			if(key < array[mid]){
				high = mid-1;
			}else if(key > array[mid]){
				low = mid +1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}
