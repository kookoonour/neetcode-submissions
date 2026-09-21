class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;

        int[] output_array = new int[size];
        output_array[0]=1;

        for(int i = 1; i < size; i++){
            output_array[i] = nums[i-1] * output_array[i-1];
        }
        // [1,2,4,6] nuns 
        // [1, 2, 8, 48] 

        int r = 1; 
        // int counter = size-1;

        // [1,2,4,6] nuns 
        // [1, 2, 8, 48] 
        
        for(int i = size-1; i >=0 ; i--){
            output_array[i] = output_array[i] * r;
            r*=nums[i];
            // counter--;
        }

        return output_array;
    }
}  
