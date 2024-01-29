public class QuickSort {

    private int stepCounter = 0;

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void printMessage(){
        System.out.println("Applying Quick Sort....");
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            // Increment the step counter
            stepCounter++;

            // Print the array after each step
            System.out.print("Step " + stepCounter + ": ");
            System.out.println();
            Main.printArray(arr);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        // Print the array after the partition
        System.out.print("After partition: ");
        System.out.println();
        Main.printArray(arr);

        return (i + 1);
    }
}
