import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] array = {64, 23, 45, 67, 222, 765, 54};
        Scanner scan = new Scanner(System.in);



        System.out.print("Original Array: ");
        System.out.println();
        printArray(array);

        System.out.println("\nPlease select the sorting you would like to use: ");
        menu();
        int choice = scan.nextInt();

        switch(choice){

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

            default:
                System.out.println("The proper option was not selected");


        }


        System.out.print("\nSorted Array: ");
        printArray(array);


        }

    public static void printArray(int[] arr){
        for (int value:arr){
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }

    public static void menu(){
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