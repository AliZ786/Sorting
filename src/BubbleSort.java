public class BubbleSort {
    public void bubbleSort(int[] arr){
        int n = arr.length;
        System.out.println("Applying Bubble Sort....");

        for (int i =0;i<n;i++){
            for (int j = 0; j < n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
            System.out.println("After pass " +(i+1)+" :");
            Main.printArray(arr);
        }

    }


}
