public class first {

    // array is sorted or not

    public static boolean isSorted(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    // array sorted using recursion

    public static boolean sorted(int arr[], int index) {
        if(index == arr.length-1) {
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
      // linear search using iteration

    public static int linerSearch(int arr[], int target) {
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
             System.out.println("Array at index at: "+arr[i]);
            } 
        }
        return -1;
    }
    static boolean find(int arr[],int target, int index) {
      
    }
    public static void main(String args[]) {
        int arr[] = {1,12,3,4,5,7,88}; 
        int target = 51;
        System.out.println(linerSearch(arr, target));
    }
}