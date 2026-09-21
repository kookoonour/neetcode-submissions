class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        // [-1,0,1,2,-1,-4]
        // [-4, -1, -1, 0, 1, 2]

        for(int i =0; i < nums.length; i++){
            if(nums[i]>0) break;
            
            if(i>0 && nums[i]== nums[i-1]) continue;

            int leftPointer = i+1; 
            int rightPointer = nums.length-1;

            while(leftPointer<rightPointer){
                int currSum = nums[leftPointer]+nums[rightPointer]+ nums[i];

                if(currSum>0){
                    rightPointer--;
                } else if(currSum<0){
                    leftPointer++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                    // has to move the two pointers bc it JUST found a soulition
                    rightPointer--;
                    leftPointer++;

                while(leftPointer<rightPointer && nums[leftPointer] == nums[leftPointer-1]){
                    leftPointer++;
                    // just incrementing the pointer as we go so that we don't keep trying
                    // to find soulitions with the same exact numbers!
                }
            }
        }
    }
    return res;
}
}