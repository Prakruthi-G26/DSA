class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        int count = 0;
        while(i < chars.length){
            j = i;
            while(j < n && chars[j] == chars[i]){
                j++;
            }
            count = j - ;
        }
        chars[write++] = chars[i]
        if count > 1{
            for c in String.valueOf(count).toCharArray(){
                chars[write++] = c;
            }
        }
        i = j;
    }
    return chars.length;
}
