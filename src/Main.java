import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {64, 23, 45, 67, 222, 765, 54};
        float[] new_arr = {0.12F, 0.21F, 0.24F, 0.36F, 0.97F, 2.12F, 0.76F, 0.67F};
        Scanner scan = new Scanner(System.in);

        System.out.print("Original Array: ");
        System.out.println();
        printArray(array);

        System.out.println("\nPlease select the sorting you would like to use: ");
        menu();
        int choice = scan.nextInt();

        switch (choice) {

            case 1:
                BubbleSort bubble = new BubbleSort();
                System.out.println();
                bubble.bubbleSort(array);
                break;

            case 2:
                SelectionSort select = new SelectionSort();
                System.out.println();
                select.selectionSort(array);
                break;

            case 3:
                InsertionSort insert = new InsertionSort();
                System.out.println();
                insert.insertionSort(array);
                break;

            case 4:
                MergeSort merge = new MergeSort();
                System.out.println();
                merge.printMessage();
                merge.mergeSort(array);
                break;

            case 5:
                HeapSort heap = new HeapSort();
                System.out.println();
                heap.heapSort(array);
                break;

            case 6:
                QuickSort quick = new QuickSort();
                System.out.println();
                quick.printMessage();
                quick.quickSort(array, 0, array.length - 1);
                break;

            case 7:
                BucketSort bucket = new BucketSort();
                System.out.println();
                bucket.bucketSort(new_arr, new_arr.length);
                break;

            default:
                System.out.println("The proper option was not selected");
        }

        System.out.print("\nSorted Array: ");
        if (choice == 7) {
            printFloatArray(new_arr);
        } else {
            printArray(array);
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }

    public static void printFloatArray(float[] arr) {
        for (float value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }

    public static void menu() {
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        System.out.println("4 - Merge Sort");
        System.out.println("5 - Heap Sort");
        System.out.println("6 - Quick Sort");
        System.out.println("7 - Bucket Sort");
        System.out.println("8 - Radix Sort");
        System.out.println("9 - Counting Sort");
    }
}
