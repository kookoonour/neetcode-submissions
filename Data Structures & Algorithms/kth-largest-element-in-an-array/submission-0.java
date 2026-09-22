class Solution {
    public int findKthLargest(int[] nums, int k) {

        // add in all of the  numbers in a MinHeap 
        // have it sorted from greatest to largest
        // store k elements in a set? or another data structure so we can give the last element
        // do this for k times and return 
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num: nums){
            minHeap.add(num);

            if(minHeap.size()> k){
                minHeap.poll();
            }
        }

        return minHeap.peek();
        // is storing the numbers in a set smarter than just traversing the minHeap and getting rid of everything greater than k elements? the problem is duplicates in the heap because if k = 3, the largest number would technically be 
        // 4 but we would traverse 1 1 2 3 4 so its tough to traverse k times...? maybe traverse k times and make k - 1 if the number was already found?
    }
}
