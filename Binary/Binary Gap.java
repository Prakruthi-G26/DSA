//problem number 868
class Solution {
    public int binaryGap(int n) {
        int lastIndex = -1;
        int currentIndex = 0;
        int maxGap = 0;

        while(n>0){
            if((n&1)==1){
                if(lastIndex != -1){
                    maxGap = Math.max(maxGap, currentIndex - lastIndex);
                }
                lastIndex = currentIndex;
            }
            n = n>>1;
            currentIndex++;
        }
        return maxGap;
    }
}

//Time complexity O(logn)
//space complexity O(1)
