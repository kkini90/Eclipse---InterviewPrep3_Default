
public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5,6,7};
		
		if(findKey(array,0,array.length-1,3)){
			System.out.println("Key found");
		}else{
			System.out.println("Key not found");
		}

	}
	
	private static boolean findKey(int[] array,int start,int end, int target){
		if(start>end)
			return false;
		
		int mid = (start+end)/2;
		if(array[mid] == target){
			return true;
		}else if(target < array[mid]){
			return findKey(array,start,mid-1,target);
		}else{
			return findKey(array,mid+1,end,target);
		}		
	}
}
