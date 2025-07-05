package July2025.ds;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxsize;

    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize + 1];
        heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int pos) { return pos / 2; }
    private int leftChild(int pos) { return 2 * pos; }
    private int rightChild(int pos) { return 2 * pos + 1; }

    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    private void heapifyUp(int pos) {
        int current = pos;
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void heapifyDown(int pos) {
        int largest = pos;
        int left = leftChild(pos);
        int right = rightChild(pos);

        if (left <= size && heap[left] > heap[largest]) largest = left;
        if (right <= size && heap[right] > heap[largest]) largest = right;

        if (largest != pos) {
            swap(pos, largest);
            heapifyDown(largest);
        }
    }

    public void insert(int element) {
        heap[++size] = element;
        heapifyUp(size);
    }

    public int extractMax() {
        int max = heap[1];
        heap[1] = heap[size--];
        heapifyDown(1);
        return max;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new  MaxHeap(4);
        maxHeap.insert(10);
        maxHeap.insert(100);
        maxHeap.insert(55);
        maxHeap.insert(100);
        System.out.println("");
        for(int i =0;i<maxHeap.maxsize;i++){
            System.out.print(maxHeap.extractMax()+" ");
        }
    }
}
