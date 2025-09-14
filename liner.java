import java.util.*;

public class liner {

    public static int linerSearch(int arr[],int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == key) {
                System.out.print("key found at index :"+i);
                
            }
        }
        System.out.println("key not found");
        return -1;
    }
    public static int binarySearch(int number[],int key) {
        int start = 0,end = number.length-1;
        while(start < end) {
            int mid = start+(end-start)/2;
            if(number[mid] == key) {
                return mid;
            }
            if(number[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++) {
            if(largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }
    public static int findValue(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++) {
            if(largest < number[i]) {
                largest = number[i];
            }
            if(smallest > number[i]) {
               smallest = number[i];
            }
        }
        System.out.println("smallest value is : " +smallest);
        return largest;
    }

    
    public static void main(String args[]) {
        int number[] = {2,4,6,8,9};
        System.out.println("largest value is : " +findValue(number));
    }
}
