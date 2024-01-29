public class MergeSort {

    private int stepCounter = 1;

    public void printMessage(){
        System.out.println("Applying Merge Sort...");
    }
    public void mergeSort(int[] arr){
        int n = arr.length;

        if (n < 2){
            return;
        }

        int mid = n/2;
        int [] l = new int[mid];
        int [] r = new int [n-mid];

        for (int i =0; i < mid; i++){
            l[i] = arr[i];
        }

        for (int i = mid; i < n; i++){
            r[i-mid]= arr[i];

        }

        // Recursive calls for left and right sub-arrays
        System.out.print("\nPass " + stepCounter + ": ");
        System.out.println();
        Main.printArray(arr);
        System.out.print("   Left sub-array: ");
        Main.printArray(l);
        System.out.print("   Right sub-array: ");
        Main.printArray(r);
        System.out.println();
        stepCounter++;

        mergeSort(l);
        mergeSort(r);

        // Merge the sorted sub-arrays
        merge(arr, l, r, mid, n - mid);

        // Print the array after each pass
        System.out.print("After pass " + stepCounter + ": ");
        System.out.println();
        Main.printArray(arr);
        stepCounter++;

    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
