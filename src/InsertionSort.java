public class InsertionSort {

    public void insertionSort(int[] arr) {
        int n = arr.length;
        System.out.println("Applying Insertion Sort....");

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Print the array after the entire sorting process
            System.out.println("After pass " + (i) + " :");
            Main.printArray(arr);
        }
    }
}