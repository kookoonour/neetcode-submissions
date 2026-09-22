class KthLargest {

    private final int k;
    private final PriorityQueue<Integer> minHeap; 

    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>();
        this.k = k;
        
        for(int num: nums){
            minHeap.offer(num);
            if(minHeap.size()> k){
                minHeap.poll();
            }
        }

    }
    
    public int add(int val) {
       minHeap.offer(val);
       if(minHeap.size()> k){
            minHeap.poll();
       }
       // need to remove anything greater than k in the MinHeap so that the top # is always the smallest and we js return that! 

       return minHeap.peek();
    }
}
