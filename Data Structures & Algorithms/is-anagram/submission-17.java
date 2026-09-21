class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();;
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String newS = Arrays.toString(sArray);
        String newt = Arrays.toString(tArray);

        return newS.equals(newt) && newS.length() == newt.length();
    }
}
