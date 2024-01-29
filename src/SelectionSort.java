public class SelectionSort {
    public void selectionSort(int[] arr){
        int n = arr.length;
        System.out.println("Applying selection sort....");

        for (int i =0; i < n-1;i++){
            int initial_min = i;
            for (int j = i+1; j< n; j++){
                if (arr[j] <arr[initial_min]){
                    initial_min = j;
                }
            }
            int temp = arr[initial_min];
            arr[initial_min] = arr[i];
            arr[i] = temp;

            System.out.println("After pass " +(i+1)+ " :");
            Main.printArray(arr);

        }
    }
}
