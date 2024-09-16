package fundamental.Heap;

public class Heap {
    private final int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE + 1];
    private int size;

    Heap() {
        size = 0;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Heap is empty!");
            return -1;
        }
        return arr[1];
    }

    public void add(int value) {
        size++;
        arr[size] = value;
        //heapify
        int curIndex = size;
        int parentIndex = curIndex / 2;
        while (arr[parentIndex] > arr[curIndex] && arr[parentIndex] != 0) {
            swap(parentIndex, curIndex);
            curIndex = parentIndex;
            parentIndex = curIndex / 2;
        }
    }
    //

    public int poll() {
        if (isEmpty()) {
            return -1;
        }
        int root = arr[1];
        arr[1] = arr[size];
        size--;

        //heapify-down
        heapifyDown(1);
        return root;
    }

    private void heapifyDown(int i) {
        int curIndex = 1;

        while ((2 * curIndex) <= size) // còn có con    ?
        {
            int leftChildIndex = 2 * curIndex;
            int rightChildIndex = leftChildIndex + 1;
            int minChildIndex = leftChildIndex;
            if (rightChildIndex <= size && arr[rightChildIndex] < arr[leftChildIndex]) // có tồn tại node bên phải hay không
            {
                minChildIndex = rightChildIndex;
            }
            if (arr[curIndex] > arr[minChildIndex]) {
                swap(curIndex, minChildIndex);
                curIndex = minChildIndex;
            } else {
                break;
            }

        }

    }

    public void remove(int v) {
        int curIndex = -1;
        for (int i = 1; i <= size; i++) {

            if (arr[i] == v) {
                curIndex = i;
                break;
            }
        }
        if (curIndex == -1) {
            System.out.println("element is not exist");
            return;
        }
        arr[curIndex] = arr[size];
        size--;
        // heapify
        heapifyDown(curIndex);


    }

    private void swap(int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.add(10);
        myHeap.add(2);
        myHeap.add(1000);
        myHeap.add(1);
        myHeap.add(0);

//        System.out.println(myHeap.peek() ); //0;
        myHeap.remove(1000);
//        System.out.println(myHeap.peek()); //1
        while (!myHeap.isEmpty()) {
            System.out.println(myHeap.poll());
        }
        // 0 1 10 1000

    }
}
