class Solution {
    public int[] productExceptSelf(int[] nums) {
        int s = nums.length;

        int[] output = new int[s];

        int[] left_output =  new int[s];
        int[] right_output =  new int[s];

        left_output[0] = 1;
        right_output[s-1] = 1; 
    

        for(int i = 1 ; i < s ; i++){
            left_output[i] = nums[i-1] * left_output[i-1];
            // [1,2,4,6]
            // left tracker adds 1 2 then 
        }
        for(int i = s-2 ; i >=0 ; i--){
            right_output[i] = nums[i+1] * right_output[i+1];
            // [1,2,4,6]
            // []
        }

        for(int i =0; i <s; i++ ){
            output[i] = right_output[i] * left_output[i];
        }
        
        return output;
    }
}  
