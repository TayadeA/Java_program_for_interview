package JavaProgramm;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		
		LengthOfLongestSubString("abbac");
		}
	public static void LengthOfLongestSubString(String s) {
		String LongestSubstring = null;
		int LongestSubstringLength = 0;
		
		Map <Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = s.toCharArray();
		
			for (int i = 0; i<arr.length;i++) {
				char ch = arr[i];
				if (!map.containsKey(ch)) {
					map.put(ch, i);   
			}else {
				i = map.get(ch);
				map.clear();
				
			}
				if (map.size() > LongestSubstringLength) {
					LongestSubstringLength = map.size();
					LongestSubstring = map.keySet().toString();			 
				}
		}
		
		System.out.println("the Longest Substring"+LongestSubstring);
		System.out.println("the Longest Substring length"+ LongestSubstringLength);
		
		
	}

}
