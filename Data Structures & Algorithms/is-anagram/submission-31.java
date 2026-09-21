class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();

        for(int i =0; i < s.length(); i++){
            char tCurr = t.charAt(i);
            char sCurr = s.charAt(i);

            if(tMap.containsKey(tCurr)){
                tMap.put(tCurr, tMap.get(tCurr) + 1 );
            } else {
                tMap.put(tCurr, 1);
            }

            if(sMap.containsKey(sCurr)){
                sMap.put(sCurr, sMap.get(sCurr) + 1 );
            } else {
                sMap.put(sCurr, 1);
            }

        }

        if (!tMap.equals(sMap)){
            return false; 
        }

        return true;
    }
}
