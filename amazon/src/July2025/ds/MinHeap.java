package July2025.ds;

public class MinHeap {
    private int[] heap;
    private int size;
    private int maxsize;

    public MinHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize + 1];
        heap[0] = Integer.MIN_VALUE;
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
        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void heapifyDown(int pos) {
        int smallest = pos;
        int left = leftChild(pos);
        int right = rightChild(pos);

        if (left <= size && heap[left] < heap[smallest]) smallest = left;
        if (right <= size && heap[right] < heap[smallest]) smallest = right;

        if (smallest != pos) {
            swap(pos, smallest);
            heapifyDown(smallest);
        }
    }

    public void insert(int element) {
        heap[++size] = element;
        heapifyUp(size);
    }

    public int extractMin() {
        int min = heap[1];
        heap[1] = heap[size--];
        heapifyDown(1);
        return min;
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(4);
        minHeap.insert(10);
        minHeap.insert(25);
        minHeap.insert(13);
        minHeap.insert(8);
        System.out.println("");
        for(int i=0;i<=minHeap.maxsize;i++){
            System.out.print(minHeap.extractMin()+" ");
        }
    }
}
