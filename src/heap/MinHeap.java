package heap;

public class MinHeap {

    // Fields

    int capacity;
    int size;
    int arr[];

    // Constructor

    public MinHeap(int c) {
        capacity = c;
        arr = new int[c];
        size = 0;
    }

    // Methods

    public int left(int i) {
        return 2*i + 1;
    }

    public int right(int i) {
        return 2*i + 2;
    }

    public int parent(int i) {
        return (i-1)/2;
    }

    public void insert(int x) {
        if(size == capacity) {
            return;
        }
        size++;
        arr[size-1] = x;
        int presentInd = size-1;
        int parentInd = (presentInd-1)/2;
        while(presentInd > 0 && arr[presentInd] < arr[parentInd]) {
            int temp = arr[presentInd];
            arr[presentInd] = arr[parentInd];
            arr[parentInd] = temp;
            presentInd = parentInd;
            parentInd = (presentInd-1)/2;
        }
    }

    public void minHeapify(int ind) {
        if(ind >= size) {
            return;
        }
        int min = arr[ind];
        if(size > 2*ind+1) {
            min = Math.min(min, arr[2*ind+1]);
        }
        if(size > 2*ind+2) {
            min = Math.min(min, arr[2*ind+2]);
        }
        if(min == arr[ind]) {
            return;
        } else if(min == arr[2*ind+1]) {
            int temp = arr[ind];
            arr[ind] = arr[2*ind+1];
            arr[2*ind+1] = temp;
            minHeapify(2*ind+1);
            return;
        } else {
            int temp = arr[ind];
            arr[ind] = arr[2*ind+2];
            arr[2*ind+2] = temp;
            minHeapify(2*ind+2);
            return;
        }
    }

    public void minHeapify2(int ind) {
        if(ind >= size) {
            return;
        }
        int leftIndex = left(ind);
        int rightIndex = right(ind);
        int indexOfMin = ind;
        if(size > leftIndex && arr[ind] > arr[leftIndex]) {
            indexOfMin = leftIndex;
        }
        if(size > rightIndex && arr[indexOfMin] > arr[rightIndex]) {
            indexOfMin = rightIndex;
        }
        if(indexOfMin != ind) {
            int temp = arr[ind];
            arr[ind] = arr[indexOfMin];
            arr[indexOfMin] = temp;
            minHeapify(indexOfMin);
        }
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getMin() {
        if(size == 0) {
            return Integer.MAX_VALUE;
        }
        return arr[0];
    }

    public int extractMin() {
        if(size == 0) {
            return Integer.MAX_VALUE;
        }
        if(size == 1) {
            size--;
            return arr[0];
        }
        swap(arr, 0, size-1);
        size--;
        minHeapify(0);
        return arr[size];
    }

    public void decreaseKey(int ind, int x) {
        if(ind >= size || ind < 0) {
            return;
        }
        arr[ind] = x;
        int parentInd = parent(ind);
        while(ind > 0 && arr[parentInd] > arr[ind]) {
            swap(arr, ind, parentInd);
            ind = parentInd;
            parentInd = parent(ind);
        }
    }

    public void delete(int ind) {
        if(ind >= size || ind < 0) {
            return;
        }
        swap(arr, ind, size-1);
        size--;
        minHeapify(ind);
    }

    public void delete2(int ind) {
        if(ind >= size || ind < 0) {
            return;
        }
        decreaseKey(ind, Integer.MIN_VALUE);
        extractMin();
    }

    public void buildHeap() {
        int ind = (size-2)/2;
        for(int i = ind; i >= 0; i--) {
            minHeapify2(i);
        }
    }
    
}
