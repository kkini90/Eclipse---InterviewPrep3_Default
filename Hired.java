
public class Hired {


	public static void main(String[] args){
		System.out.println(solution("We test coders. Give us a try?"));
	}
    public static int solution(String S) {
        // write your code in Java SE 8
        String[] strSplit = S.split("[.?!]");
        int count =0;
        int words =0;
        int countWords=0;
        int maxWord = Integer.MIN_VALUE;
        /*for(int i=0;i<strSplit.length;i++){
        	strSplit[i] = strSplit[i].trim();
        }*/
        for(String str :strSplit){
            String[] s = str.split(" ");
            
            for(String sStr : s){
            	
            		if(!sStr.isEmpty()){
            			countWords++;
            		}
            	
                
                }
            words = countWords;
            countWords =0;
              if(words> maxWord){
                  maxWord = words;
                  } 
            }
            return maxWord;
    }
}