import java.util.*;


public class Pangram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scanner.nextLine();
        HashSet<Integer> set = new HashSet<Integer>();
        string = string.toLowerCase();
        
        for(int i=0;i<string.length();i++){
            if(string.charAt(i) != ' '){
                int val = (int)string.charAt(i);
                set.add(val);
            }
        }	
        
        if(set.size() == 26){
            System.out.println("Pangram");        
        }else{
            System.out.println("Not Pangram");
        }
        
    }
}