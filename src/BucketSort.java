import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class BucketSort {
    public void bucketSort(float[] arr, int n) {
        System.out.println("Applying Bucket Sort....");
        if (n <= 0)
            return;

        // Find the maximum value in the array
        float maxValue = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        // 1) Create n empty buckets
        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<>();
        }

        // 2) Put array elements in different buckets
        System.out.println("Step 1: Initial array");
        System.out.println("[" + Arrays.toString(arr) + "]");
        for (int i = 0; i < n; i++) {
            int idx = (int) Math.min(arr[i] / maxValue * n, n - 1);
            buckets[idx].add(arr[i]);
        }

        // 3) Sort individual buckets
        System.out.println("Step 2: Buckets after inserting elements");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Bucket " + i + ":\n" + buckets[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Step 3: Bucket " + i + " after sorting");
            System.out.println();
            System.out.println("[" + buckets[i] + "]");
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }

        System.out.println("Step 4: Sorted array");
        System.out.println();
        System.out.println("[" + Arrays.toString(arr) + "]");
    }
}