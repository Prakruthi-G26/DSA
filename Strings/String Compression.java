class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        int count = 0;
        int n = chars.length;
        while(i < n){
            int j = i;
            while(j < n && chars[j] == chars[i]){
                j++;
            }
            count = j - i;
            chars[write++] = chars[i];
            if(count > 1){
                for (char c : String.valueOf(count).toCharArray()){
                    chars[write++] = c;
                }
            }
            i = j;
        }
        return write;
    }
}
