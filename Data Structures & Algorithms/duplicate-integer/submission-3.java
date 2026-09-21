class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> s = new HashSet<>();

        for(int i =0; i < nums.length ; i++){
            int curr = nums[i];
            if(s.contains(curr)){
                return true;
            } else {
                s.add(curr);
            }
        }

        return false;
        
    }
}