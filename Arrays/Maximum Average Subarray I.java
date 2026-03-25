class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = Double.MIN_VALUE;
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        maxSum = sum;
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i];
            sum = sum - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }
}

//Time complexity: O(n)
//Space complexity: O(1)
