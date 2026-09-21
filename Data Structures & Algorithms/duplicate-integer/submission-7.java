class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create the data structure that we will store numbers in! 
        Set<Integer> numberList = new HashSet<>();
        // [1, 2, 2 ] type of list where u CANNOT HAVE DUPLICATES
        for(int i =0; i < nums.length; i++){
            int curr = nums[i];
            // if else statement to check whetehr the set is still good and doesnt have duplicates 
//             i = 0 
//             [1]
// `              
//             i = 1 
//             [1, 2,]

//             i = 2 
//             [1, 2, 3]
            
            
//             i = 3  
//             [1, 2, 3, 3 ]

            if(numberList.contains(curr)){
                return true; 
            } 
            
            numberList.add(curr);

        }

        return false; 
    }
}