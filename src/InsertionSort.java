public class InsertionSort {
    static int[] list = {5, 2, 8, 3, 1};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
            for (int k = 0; k <= i; k++) {
                System.out.print(list[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
    }
}
