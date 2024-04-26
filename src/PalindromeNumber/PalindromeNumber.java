package PalindromeNumber;

// https://leetcode.com/problems/palindrome-number/
// Leetcode 9. Palindrome Number
public class PalindromeNumber {

    // Solution 1
    public boolean isPalindrome1(int x) {
        StringBuilder str = new StringBuilder(Integer.toString(x));

        return str.toString().equals(str.reverse().toString());
    }

    // Solution 2
    public boolean isPalindrome2(int x) {
        int temp = x;
        int rev = 0;
        while (x>0){
            int digit = x%10;
            rev = (rev*10)+digit;
            x/=10;
        }
        return rev==temp;
    }

}
