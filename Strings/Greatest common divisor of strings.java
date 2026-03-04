//input - two strings str1, str2
//output - string t that devides both str1 and str2
//t must be a substring of both str1 and str2 to devide both
//and both string must not contains anything other than characters of t
//similar to largest substring 
// GCD 


class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String t = "";
        if((str1+str2).equals(str2+str1)){
            int n = gcd(str1.length(),str2.length());
            t = t+str1.substring(0,n);
        }
        return t;
    }
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
