class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;

        int[] output_array = new int[size];

        int[] left_array = new int[size +1];
        int[] right_array = new int[size +1];
        left_array[0] =1;
        right_array[size-1] =1;


        for(int i = 1; i < size; i++){
            left_array[i] = nums[i-1] * left_array[i-1];
        }

        for(int i= size-2; i>=0; i--){
            right_array[i] = nums[i+1] * right_array[i+1];
        }

        for(int i = 0; i < size; i++){
            output_array[i] = right_array[i] * left_array[i];
        }

        return output_array;
    }
}  
