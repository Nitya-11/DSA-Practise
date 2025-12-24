import java.util.*;
public class Binary {

    //Linear Search
    public static int linearSearch(int number[],int key) {
        for(int i=0;i<number.length;i++) {
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    // Binary Search
    public static int binarySearch(int number[], int key) {
        int start = 0, end = number.length-1;
        while(start<end){

            int mid = (start+end)/2;
            for(int i=0;i<number.length;i++){
                if(number[mid] == key){
                    return mid;
                }
                if(number[mid] < key){
                    start= mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    // largest value is the array
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    // Reverse an array
    public static void reverse(int number[]) {
        int start=0, end = number.length-1;
        while(start < end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
        }
    }

    /// Print Pairs
    public static void printPairs(int number[]) {
        int tp = 0;
        for(int i=0;i<number.length;i++){
            int current = number[i];
            for(int j= i+1;j<number.length;j++){
                System.out.print("("+current+","+number[j]+")");
                tp++;
            }
            System.out.println();
            System.out.println("Total pairs: "+tp);
        }
    }
     // Subarray in the array
     public static void printSubarray(int number[]) {
        int totalsub = 0;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                for(int k=start;k<end;k++){
                    System.out.print(number[k]+" ");
                    totalsub++;
                }
                System.out.println();
            }
        }
        System.out.println("total subarray is : "+totalsub);
     }
     // max subarray sum
     public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<number.length;i++){
          cs = cs + number[i];
          if(cs < 0){
            cs = 0;
          } 
          ms = Math.max(cs,ms); 
        }
        System.out.println("our maximum subarray sum  is :"+ms);
     }
     // Buy and sell stock
     public static int buyAndSellStock(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = buyPrice  - price[i];
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
     }

    public static void Maxsubarraysum(int number[]) {
        for(int i=0;i<number.length;i++) {
            int start = i;

            for(int j=0;j<number.length;j++) {
                int end = j;

                for(int k=start;k<=end;k++) {
                    System.out.println("The maximum subarray sum is : ");
                }
            }
        }
    }
    public static void main(String args[]) {
      int number[] = {7,2,9,2,4,5};
      Maxsubarraysum(number);
    }
}
