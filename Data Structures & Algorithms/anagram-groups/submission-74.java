class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> listOfAnagrams = new HashMap<>();

        for(String curr: strs){

            // create a sorted key
            char[] s = curr.toCharArray();
            Arrays.sort(s);
            String newCurr = String.valueOf(s);

            if(!listOfAnagrams.containsKey(newCurr)){
                List<String> l =  new ArrayList<>();
                l.add(curr);
                listOfAnagrams.put(newCurr,l);
            }else {
                List<String> currList = listOfAnagrams.get(newCurr);
                currList.add(curr);   

            }

        }
        List<List<String>> finalList = new ArrayList<>(listOfAnagrams.values());
        return finalList;

    }
}
