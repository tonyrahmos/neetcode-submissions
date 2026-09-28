class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int left = 0, right = 0, longestSubstring = 0;
        Set<Character> characters = new HashSet<>();
        while (right < s.length()) {
            if (characters.add(s.charAt(right))) {
                right++;
                longestSubstring = Math.max(characters.size(), longestSubstring);
            } else {
                characters.remove(s.charAt(left));
                left++;
            }
        }
        return longestSubstring;
    }
}
