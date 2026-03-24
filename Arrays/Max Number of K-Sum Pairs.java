class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while(left < right){
            int sum  = nums[left]+nums[right];
            if(sum == k){
                left++;
                right--;
                count++;
            }
            else if(sum > k){
                right--;
            }
            else{
                left++;
            }
        }
        return count;
    }
}

//time complexity - O(NlogN)
//space complexity - O(1)

//Optimal Approach

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;

            if (map.getOrDefault(complement, 0) > 0) {
                count++;
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}

//time complexity - O(n)
//space complexity - O(n)
