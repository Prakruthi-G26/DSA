class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            if(height[i] < height[j]){
                water = Math.max(water, (j-i)*height[i]);
                i++;
            }
            else{
                water = Math.max(water, (j-i)*height[j]);
                j--;
            }
        }
        return water;
    }
}

//Time complexity - O(n)
//Space complexity - O(1)
