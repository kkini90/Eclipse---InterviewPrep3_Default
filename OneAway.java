
public class OneAway {

	public static void main(String[] args) {
		String str1 = "Apl"
				+ "e";
		String str2 = "Apple";
		
		if(oneEditAway(str1,str2)){
			System.out.println("One edit away");
		}else{
			System.out.println("No edit away");
		}
	}

	private static boolean oneEditAway(String first, String second) {
		if(first.length() == second.length()){
			return oneEditReplace(first,second);
		}else if(first.length() +1 == second.length()){
			return oneEditInsert(first,second);
		}else if(first.length() -1 == second.length()){
			return oneEditInsert(second,first);
		}
		return false;
	}

	private static boolean oneEditReplace(String first, String second) {
		boolean foundDifference = false;
		
		for(int i=0;i<first.length();i++){
			if(first.charAt(i) != second.charAt(i)){
				if(foundDifference){
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}

	private static boolean oneEditInsert(String first, String second) {
		int index1 = 0;
		int index2 = 0;
		
		while( index1 < first.length() && index2 < second.length() ) {
			if(first.charAt(index1) != second.charAt(index2)){
				if(index1 != index2){
					return false;
				}
				index2++;
			}else{
				index1++;
				index2++;
			}
		}
		return true;
	}

}
