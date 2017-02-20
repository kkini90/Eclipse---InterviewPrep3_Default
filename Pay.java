import java.util.HashMap;

public class Pay {

	public static void main(String[] args) {

		String[] array1 ={"lion","tiger","cat","a","a","lion"};
		String[] array2 ={"lion","tiger","cat","lion","a","a","lion"};
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();

		for (String str : array1) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		for (String str : array2) {
			if (map.containsKey(str) && map.get(str) > 0) {
				System.out.println(str);
				map.put(str, map.get(str) - 1);				
			}
		}
	}
}
