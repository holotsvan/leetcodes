package RomantToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // Leetcode 13 Romat to Integer
    // https://leetcode.com/problems/roman-to-integer/description/

    // Solution 1
    public int soulution1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int number = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int[] numbers = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            numbers[i] = map.get(s.charAt(i));
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                number -= numbers[i];
            } else {
                number += numbers[i];
            }
        }

        return number + numbers[numbers.length - 1];
    }

    // Solution 2
    public int solution2(String s) {
        int number = 0, current = 0, prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> current = 1000;
                case 'D' -> current = 500;
                case 'C' -> current = 100;
                case 'L' -> current = 50;
                case 'X' -> current = 10;
                case 'V' -> current = 5;
                case 'I' -> current = 1;
            }

            if (current < prev) {
                number -= current;
            } else {
                number += current;
            }
            prev = current;
        }

        return number;
    }
}
