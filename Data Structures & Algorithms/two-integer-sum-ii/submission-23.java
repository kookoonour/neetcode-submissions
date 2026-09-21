class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1; 
        int left =0; 

        while(left < right){
            int curr = numbers[left] + numbers[right];
            if(curr == target){
                break; 
            } else if(curr> target ){
                right--;
            } else {
                left++;
            }
        }

        return new int[]{left + 1 , right + 1 };

    }
}
