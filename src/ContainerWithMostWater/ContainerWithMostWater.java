package ContainerWithMostWater;
// https://leetcode.com/problems/container-with-most-water
// Leetcode 11: Container With Most Water
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {3,4,6,2,5,4,8,7,4};
        maxArea(height);
    }

    // Solution 1
    public static int maxArea(int[] height) {
        int maxArea =0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                maxArea =Math.max(maxArea,(right-left)*height[left]);
                left++;
            }else{
                maxArea =Math.max(maxArea,(right-left)*height[right]);
                right--;
            }
        }

        return maxArea;
    }
}
