//Brute-force approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}

//time complexity - O(n^2)
//space complexity - O(1)

//HashMap approach


//time complexity - O(n^2)
//space complexity - O(1)
