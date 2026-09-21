class Solution {

    public String encode(List<String> strs) {
        

        String encodedList ="";

        for(String curr: strs){
            encodedList+= curr.length() + "#" + curr;
        }
        return encodedList;
    }

    public List<String> decode(String str) {
        if(str.isEmpty()){
            return new ArrayList<>();
        }
        List<String> encodedList = new ArrayList<>();

        // string is  4#hibye 
        int i = 0;
        while(i < str.length()){
            int j = i; 

            while(str.charAt(j) != '#'){
                j++;
            }
            // # at here now 
            int length = Integer.parseInt(str.substring(i,j));
            i = j+ 1;
            j = i+ length;
            encodedList.add(str.substring(i,j));
            i = j;
        }

        // access

        return encodedList;
    }
}
