class Solution {
    public int majorityElement(final int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for (Integer key : freq.keySet()){
            if(freq.get(key)>n/2){
                return key;
            }
        }
        return 0;
    }
}

//Time complexity O(n)
//space complexity O(n)
