class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        int l = 0;

        int max =0; 

        while(l < s.length()){
            String substring ="";
            Set<Character> set = new HashSet<>();
            int curr = l; 

            while(curr < s.length() && !set.contains(s.charAt(curr))){
                substring+= s.charAt(curr);
                set.add(s.charAt(curr));
                curr++;
            }

        max = Math.max(substring.length(), max);
        l++;
        }

        return max;
        
    }
}
