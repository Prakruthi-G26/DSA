class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;
        while(x>0){
            reversed = reversed*10 + x%10;
            x = x/10;
        }
        return original == reversed;
    }
}

//Time complexity O(log n)
//space complexity O(1)