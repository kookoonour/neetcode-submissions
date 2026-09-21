class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        // key value pairs
        // where value is the frequency
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0 ; i < freq.length ; i++){
            freq[i] = new ArrayList<>();
        }

        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0)+ 1);
        }
        // or u can do count.put(n, count.getOrDefault(n, 0) + 1);


        for(Map.Entry<Integer, Integer> entry: count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] topK = new int[k];
        int index = 0; 
        for(int i = freq.length -1 ; i > 0 && index < k ; i-- ){
            for( int curr: freq[i]){
                topK[index++] = curr;
                if(index == k ){
                    return topK;
                }
            }
        }

        return topK;

        
    }
}
