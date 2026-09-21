class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> first = new TreeMap<>();
        Map<Character, Integer> second = new TreeMap<>();


        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (first.containsKey(c)) {
                first.put(c, first.get(c) + 1);
            } else {
                first.put(c, 1);
            }
                }

        for(int i = 0 ; i < t.length() ; i++){
            char c = t.charAt(i);
            if (second.containsKey(c)) {
                second.put(c, second.get(c) + 1);
            } else {
                second.put(c, 1);
            }
        }

        if(first.equals(second)){
            return true;
        } else {
            return false; 
        }

    }
}
