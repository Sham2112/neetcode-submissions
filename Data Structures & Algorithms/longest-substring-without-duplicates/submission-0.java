class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int l = 0;
        int ans = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            while (freq[c] > 0) {
                freq[s.charAt(l)]--;
                l++;
            }

            freq[c]++;
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
