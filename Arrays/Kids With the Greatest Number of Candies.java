class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> result = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result; 
    }
}

//Time complexity O(n)
//space complexity O(1)
