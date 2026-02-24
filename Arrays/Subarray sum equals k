//560
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sum = new HashMap<>();
        sum.put(0, 1);   // Important initialization
        
        int cs = 0;
        int count = 0;
        
        for (int num : nums) {
            cs += num;
            
            if (sum.containsKey(cs - k)) {
                count += sum.get(cs - k);
            }
            
            sum.put(cs, sum.getOrDefault(cs, 0) + 1);
        }
        
        return count;
    }
}

//Time complexity - O(n)
//Space complexity - O(n)
