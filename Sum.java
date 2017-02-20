
public class Sum {

	public static void main(String[] args) {
		int[] array1 = new int[]{9,9,3};
		int[] array2 = new int[]{0,6};
		
		int i = array1.length-1;
		int j = array2.length-1;
		int sum =0;
		int carry =0;
		int remainder;
		int k = array1.length > array2.length ?array1.length-1:array2.length-1;
		
		int[] result = new int[array1.length > array2.length ?array1.length:array2.length];
		while(i>=0 &&j >=0){
			sum = array1[i] + array2[j] + carry;
			if(sum>9){
				remainder = sum %10;
				carry = sum/10;
				result[k] = remainder;
			}else{
				result[k] = sum;
				
			}
			k--;
			i--;j--;
			
		}
		
		while(i>=0){
			if(carry!=-1){
				sum = carry+ array1[i];
				if(sum>9){
					remainder = sum%10;
					carry = sum/10;
					result[k] = remainder;
					
				}else{
					result[k] = sum;
					
				}
				k--;i--;
				
			}else{
				
			}
			
		}
		
		while(j>=0){
			if(carry!=-1){
				sum = carry+ array2[j];
				if(sum>9){
					remainder = sum%10;
					carry = sum/10;
					result[k] = remainder;
					j--;k--;
				}
				
				
			}else{
				result[k] = sum;
				k--;i--;
			}
		}
		
		
		for(int z : result){
			System.out.println(z);
		}
		
	}

}
