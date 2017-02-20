
public class LengthOfLongSubstring {

	public static void main(String[] args) {
		System.out.println("Length " + lengthOfLongestSubstring("abcabcd"));
	}

	static int lengthOfLongestSubstring(String string) {
		  int n = string.length();
		  char[] str = new char[string.length()];
		  str = string.toCharArray();
		  
		  int i = 0, j = 0;
		  int maxLen = 0;
		  boolean[] exist = new boolean[256];
		  while (j < n) {
		    if (exist[str[j]]) {
		      maxLen = Math.max(maxLen, j-i);
		      while (str[i] != str[j]) {
		        exist[str[i]] = false;
		        i++;
		      }
		      i++;
		      j++;
		    } else {
		      exist[str[j]] = true;
		      j++;
		    }
		  }
		  maxLen = Math.max(maxLen, n-i);
		  return maxLen;
		}
}
