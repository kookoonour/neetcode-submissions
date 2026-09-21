class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> listOfAnagrams = new HashMap<>();
        
        for(String currWord: strs){
            char[] arr = currWord.toCharArray();
            Arrays.sort(arr);

            String orderedKey = new String(arr);


            if(listOfAnagrams.containsKey(orderedKey)){
                List<String> curr = listOfAnagrams.get(orderedKey);
                curr.add(currWord);
                listOfAnagrams.put(orderedKey, curr);
            } else {
                List<String> curr = new ArrayList<>();
                curr.add(currWord);
                listOfAnagrams.put(orderedKey, curr);
            }
            
        }

        List<List<String>> list = new ArrayList<>(listOfAnagrams.values());

        return list;

    }
}
