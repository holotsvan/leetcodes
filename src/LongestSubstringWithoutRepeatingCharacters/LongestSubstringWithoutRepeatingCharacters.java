package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

// Leetcode 3: Longest SubstringWithoutRepeatingCharacters
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }

    // Approach 1 (faster)
    public int lengthOfLongestSubstring1(String s) {
        if (s.isEmpty())
            return 0;

        int max = 0;
        int left = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(left++));
            }
            set.add(c);
            max = Math.max(max, set.size());
        }
        return max;
    }

    // Approach 2 (slower)
    public int lengthOfLongestSubstring2(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if(currentSubstring.indexOf(String.valueOf(s.charAt(j)))!=-1){
                    break;
                }
                currentSubstring.append(s.charAt(j));
                max = Math.max(currentSubstring.length(),max);
            }
        }
        return max;
    }
}
