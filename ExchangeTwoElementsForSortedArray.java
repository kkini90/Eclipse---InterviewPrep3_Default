class SolutionForExchangeTwoElementsForSortedArray {

    public boolean solution(int[] A) {
    	int len = A.length;
		int firstIndex = -1;
		int secondIndex = len-1;
		
		for(int i=1;i<len;i++){
			if(firstIndex < 0){
				if(A[i-1] > A[i]){
					firstIndex = i-1;
				}
			}
			else{
				if(A[firstIndex] <= A[i]){
					secondIndex = i-1;
					break;
				}
			}
		}
		
		if(firstIndex != -1){
			int temp = A[firstIndex];
			A[firstIndex]=A[secondIndex];
			A[secondIndex]=temp;
		}
		for(int i=1;i<len;i++){
			if(A[i-1]>A[i]){
				return false;
			}
		}
		
		return true;
	
	}
    }
//1 2 3 return true
//1 3 2 return true
//3 2 1 return false

public class ExchangeTwoElementsForSortedArray {

    public static void main(String[] args) {
        SolutionForExchangeTwoElementsForSortedArray mSol = new SolutionForExchangeTwoElementsForSortedArray();
        System.out.println("1" +mSol.solution(new int[] {4,2,2,2,5}));
        System.out.println("2" +mSol.solution(new int[] {4,2,2,2,3}));
        System.out.println("3" +mSol.solution(new int[] {3,2,2,2,3,3,4,4,4}));
        System.out.println("4" +mSol.solution(new int[] {3,2}));
        System.out.println("5" +mSol.solution(new int[] {3,2,2}));
        System.out.println("6" +mSol.solution(new int[] {3,2,4}));
        System.out.println("7" +mSol.solution(new int[] {8,2,2,4}));
        System.out.println("8" +mSol.solution(new int[] {8}));
        System.out.println("9" +mSol.solution(new int[] {3,5,1,3,7}));
        System.out.println("10" +mSol.solution(new int[] {1,3,500000000}));
        
    }
}