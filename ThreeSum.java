import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		int[] array = new int[]{-3, -2, 0, 2, 4};
		if(isThreeSum(array)){
			System.out.println("Makes three sum");
		}else{
			System.out.println("Does not make three sum");
		}

	}

	private static boolean isThreeSum(int[] a) {
		if(a == null || a.length == 0){
			return false;
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			int j = i+1;
			int k = a.length-1;
			
			while(j<=k){
				if(a[i] + a[j] + a[k] == 0){
					System.out.println(a[i] +" " +a[j]+" " + a[k]);
					return true;
				}else if(a[i] + a[j] + a[k] > 0){
					k--;
				}else{
					j++;
				}
			}
		}
		return false;	
	}

}
//Time complexity worst case :O(n*n)