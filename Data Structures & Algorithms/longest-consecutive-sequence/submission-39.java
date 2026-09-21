class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> s = new TreeSet<>();
        //track numbers in a set 
        // after there sorted loop through set and
        
        for(int i =0; i<nums.length;i++){
            s.add(nums[i]);
        }

        int max =0;
        for(int num: s){
            int tracker =0;
            int curr = num;
            while(s.contains(curr)){
                tracker++;
                curr+=1;
            }
            max = Math.max(tracker, max);
            // tracker=0;

        }
        return max;
    }
}
