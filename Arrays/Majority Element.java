//solved on interviewBit.com
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int n = A.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(A[i],freq.getOrDefault(A[i],0)+1);
        }
        for (Integer key : freq.keySet()){
            if(freq.get(key)>n/2){
                return key;
            }
        }
        return 0;
    }
}
