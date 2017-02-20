
public class Max_Diff_In_Array {

	public static void main(String[] args) {
		
			int result = 0;
			int[] array = {7,-1,10,100,2,-5};
				int N = array.length;
			    if (N < 1) System.out.println("error");

			    int max = 0;
			    for(int i = N-1; i >= 0; --i)
			    {
			        if(array[i] > max)
			            max = array[i]; //find max

			        int maxDiff = max - array[i]; //find max diff   
			        if(maxDiff > result)
			            result = maxDiff;
			    }

			    System.out.println("Max difference in array is : " + result);
			     
			}


}//28-1=27 is max diff in array

