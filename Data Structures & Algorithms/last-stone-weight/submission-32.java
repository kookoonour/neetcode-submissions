class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Collections.reverseOrder());
    
    for(int curr: stones){
        maxHeap.offer(curr);
    }

    while(maxHeap.size()> 1){
        int y = maxHeap.poll(); // largest
        int x = maxHeap.poll(); // second largest

        if(x == y){
            continue;
        } if(x < y){
            // x stays polled 
            // y = y-x 
            y = y - x; 
            maxHeap.offer(y);
        }
    }

    return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
