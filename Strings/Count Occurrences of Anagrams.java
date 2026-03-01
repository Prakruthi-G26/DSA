class solution {
    public static int countAnagrams(String text, String pattern) {
        int k = pattern.length();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : pattern.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int count = map.size();
        int i = 0, ans = 0;

        for (int j = 0; j < text.length(); j++) {
            char end = text.charAt(j);
            if (map.containsKey(end)) {
                map.put(end, map.get(end) - 1);
                if (map.get(end) == 0) count--;
            }

            if (j - i + 1 == k) {
                if (count == 0) ans++;

                char start = text.charAt(i);
                if (map.containsKey(start)) {
                    map.put(start, map.get(start) + 1);
                    if (map.get(start) == 1) count++;
                }
                i++;
            }
        }
        return ans;
    }

}
