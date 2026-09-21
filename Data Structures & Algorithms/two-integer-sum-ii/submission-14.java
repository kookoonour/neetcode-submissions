class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length-1;
        int left =0;

        // for(int i =0; i < numbers.length;i++){
            while(left < right){
                int curr = numbers[left] + numbers[right];
                if(curr == target){
                    break;
                } else if(curr < target){
                    left++;
                } else if(curr>target){
                    right--;
                } 
            }
        // }

        return new int[]{left + 1 ,right +1};

    }
}
