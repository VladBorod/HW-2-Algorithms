import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
                int array[] = new int[]{
                12, 87, 3, 11, 61, 42, 47, 84, 5, 29, 5, 12, 41, 11, 18,
                3, 12, 6, 43, 54, 87, 505, 9, 55, 22, 4, 9, 9, 8, 17,
                1, 10, 24, 62, 42, 45, 300, 333, 2, 129, 4, 5, 76, 3, 91
        };

        heapSort(array);
        System.out.println("Heap sort: " + Arrays.toString(array));

    }

    private static void heapSort(int[] array) {
        int n = array.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(array,  i, n);
        }

        for (int i = n - 1; i >= 0 ; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, 0, i);
        }
    }

// "Родитель" определяется большим чем его "дети"!
    private static void heapify(int[] array, int i, int n) {
        int leftKid = i * 2 + 1;
        int rightKid = i * 2 + 2;
        int largest = i;

        if (leftKid < n && array[leftKid] > array[largest]){
            largest = leftKid;
        }
        if (rightKid < n && array[rightKid] > array[largest]){
            largest = rightKid;
        }

        if (i != largest){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, largest, n);
        }
    }

}
