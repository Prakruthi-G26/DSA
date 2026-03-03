//input - two words
//output - alternatevely merged word
// my approach is to while loop through both words, add letters alternatevely to the new string 

//using string - normal approach
 class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        String res = "";

        while(i<word1.length() && j<word2.length()){
            res=res+word1.charAt(i);
            res=res+word2.charAt(j);
            i++;
            j++;
        }

        while(i<word1.length()){
            res=res+word1.charAt(i);
            i++;
        }

        while(j<word2.length()){
            res=res+word2.charAt(j);
            j++;
        }

        return res;
    }
}

