public class HeapSort {
    public static void sort(int[] array) {
        int length = array.length;
        for (int i = length / 2; i >= 0; i--) {
            heap(array, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heap(array, i, 0);
        }
        showArray(array);
    }

    public static void heap(int[] array, int size, int ind) {
        int max = ind;
        int leftChild = 2 * ind + 1;
        int rightChild = 2 * ind + 2;

        if (leftChild < size && array[leftChild] > array[max]) {
            max = leftChild;
        }
        if (rightChild < size && array[rightChild] > array[max]) {
            max = rightChild;
        }
        if (max != ind) {
            int temp = array[ind];
            array[ind] = array[max];
            array[max] = temp;

            heap(array, size, max);
        }
    }

    public static void showArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,6,5,8,3,4,7,1};
        sort(array);
    }
}
