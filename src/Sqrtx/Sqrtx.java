package Sqrtx;

// Leetcode 69 Sqrt(x)
// https://leetcode.com/problems/sqrtx/description/
public class Sqrtx {

    // Solution 1
    public int solution1(int x) {
        long n = x;
        while(n*n>x){
            n=(n+x/n)/2;
        }
        return (int) n;
    }
}
