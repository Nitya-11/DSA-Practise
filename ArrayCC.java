import java.util.*;

public class ArrayCC {

    //bubble sort

    public static void bubbleSort(int num[]) {
      for(int turn = 0;turn < num.length-1; turn++) {
         for(int j = 0;j < num.length-1-turn; j++) {
             if(num[j] > num[j+1]) {
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
             }
         }
      }
    }

     // Selection Sort
     public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length;j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
     }

     // Insertion sort

     public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
     }

    public static void printArr(int num[]) {
        for(int i=0;i<num.length-1;i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int num[] = {8,4,3,1,9,2,5,7};
        insertionSort(num);
        printArr(num);
    }
}