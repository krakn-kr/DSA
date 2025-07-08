package July2025.problems.q295.BF;

import java.util.ArrayList;
import java.util.List;

class MedianFinder {
    List<Integer> arr;
    public MedianFinder() {
        arr = new ArrayList<>();
    }

    public void addNum(int num) {
        arr.add(num);
    }

    public double findMedian() {


        int n = arr.size();
        if (n % 2 == 0) {
            return (arr.get(n/2 - 1) + arr.get(n/2)) / 2.0;
        } else {
            return arr.get(n/2) * 1.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */