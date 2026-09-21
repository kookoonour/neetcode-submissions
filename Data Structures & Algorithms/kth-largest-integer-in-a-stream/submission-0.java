class KthLargest {
    private final int k; 
    private final PriorityQueue<Integer> minHeap; 

    public KthLargest(int k, int[] nums) {
    // more efficent soulition -> use a minHeap and cut any numbers after k so that every time ur keeping only the top numbers 
    this.k = k;
    this.minHeap = new PriorityQueue<>();

    for(int num: nums){
        add(num);
    }
    }
    
    public int add(int val) {
        minHeap.add(val); 
        if(minHeap.size()>k){
            minHeap.poll(); 
        }

    return minHeap.peek();

    }
}
