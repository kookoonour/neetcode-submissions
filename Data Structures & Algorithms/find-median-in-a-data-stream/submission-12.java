class MedianFinder {
    private static ArrayList<Integer> MedianFinder;

    public MedianFinder() {
        this.MedianFinder = new ArrayList<>();
    }
    
    public void addNum(int num) {
        this.MedianFinder.add(num);
    }
    
    public double findMedian() {
        Collections.sort(MedianFinder);
        int size = MedianFinder.size(); 
        if(size % 2 == 1){
            return MedianFinder.get(size/ 2);
        } else {
            return (MedianFinder.get(size / 2) + MedianFinder.get(size / 2 - 1)) / 2.0;
        }
    }
}
