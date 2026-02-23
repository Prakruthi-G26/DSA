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
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = target - nums[i];
            if(map.containsKey(num) && map.get(num)!=i){
                return new int [] {i, map.get(num)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

//time complexity - O(n^2)
//space complexity - O(1)
