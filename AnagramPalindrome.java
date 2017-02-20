import java.util.Scanner;

public class AnagramPalindrome {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        //input.toLowerCase();
       // input= input.toLowerCase();
        if( checkPalindrome(input) )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean checkPalindrome(String input)
    {
            int [] count = new int[26];
            for( int i = 0; i < input.length(); i++ )
            {
                char ch = input.charAt(i);
                count[ch - 'a']++;
            }
            int oddOccurance = 0;
            for( int cnt:count )
            {
                if( oddOccurance > 1) // more than 1 char should have odd frequency
                    return false;
                if( cnt%2 == 1 )
                    oddOccurance++;
            }
            return true;
    }
}