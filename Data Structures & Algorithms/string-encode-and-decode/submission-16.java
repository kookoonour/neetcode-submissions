class Solution {

    public String encode(List<String> strs) {
        // encoded list we want to 
        // create a pattern for the decode methoed to be able to take off
        // length sepator string
        String n = "";

        for(String curr: strs){
            n+= curr.length() + "#" + curr;

        }
        return n; 
    }

    public List<String> decode(String str) {

        // at this point we have 
        // 2#we3#say

        if(str.isEmpty()){
            return new ArrayList<>();
        }

        // else we want to iterate thorugh the new string
        // stop at length = 2 
        // skip # 
        // iterate through String 
        // add to the current list of strings
        List<String> n = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            String curr =""; 
            while(str.charAt(j)!= '#'){
                j++; 
            }
            int length = Integer.parseInt(str.substring(i, j));
            // gets # 
            i = j + 1;
            // moves i to start after #
            j = i + length;
            // moves j 
            n.add(str.substring(i, j));
            i = j;

        }
        return n;
    }
}
