import java.util.*;

public class liner {
    public static int linerSearch(int num[],int key) {
       for(int i=0;i<num.length;i++) {
        if(num[i] == key) {
            System.out.println("key found at index :"+i);
            return i;
        }
       }
       System.out.println("key not found");
       return -1;
    }

    public static int binarySearch(int num[],int key) {
        int start = 0,end = num.length-1;
        while(start <= end) {
            int mid = (start+end)/2;

            if(num[mid] == key) {
                return mid;
            }

            if(num[mid] < key){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("largest value is : "+largest);
        System.out.println("smallest value is : "+smallest);
        return -1;
    }

    public static void reverse(int num[]) {
        int start = 0,end = num.length-1;
        while(start < end) {
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
        for(int i=0;i<num.length;i++) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
    }

    public static void printPairs(int num[]) {
        int tp = 0;
        for(int i=0;i<num.length;i++) {
            int curr = num[i];
            for(int j=i+1;j<num.length;j++) {
                System.out.print("("+curr+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs : "+tp);
    }

    public static void printSubarrays(int num[]) {
        int ts = 0;
        for(int i=0;i<num.length;i++) {
        int start = i;
        for(int j = i+1;j<num.length;j++) {
            int end = j;
            for(int k=start;k<=end; k++) {
                System.out.print(num[k]+" ");
            }
            ts++;
            System.out.println();
        }
        System.out.println();
        }
        System.out.println("Total subarray is :"+ts);
    }

    public static void kadanes(int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++) {
            cs = Math.max(num[i],cs+num[i]);
            ms = Math.max(cs,ms);
        }
        System.out.println("our maxsubarray sum is : "+ms);
    }

    public static int trappedrainWater(int height[]) {
        //left max
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++) {
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //right max
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int j=n-2;j>=0;j--) {
            rightmax[j] = Math.max(height[j],rightmax[j+1]);
        }
        //waterlevel
        int trappedwater = 0;
        for(int i = 0; i < n; i++) {
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            //trappedwater
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }

    public static boolean palinedrome(String str) {
        for(int i=0;i<str.length()/2;i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static float getshortestPath(String path) {
        int x = 0, y = 0;

        for(int i=0;i<path.length();i++) {
            char dir = path.charAt(i);
            //South
            if(dir == 'S') {
                y--;
            }
            //North
            else if(dir == 'N') {
                y++;
            }
            //west
            else if(dir == 'W') {
                x--;
            }
            //East
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
     
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for(int i=si;i<ei;i++) {
           substr += str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++) {
            if(str.charAt(i) == ' ' &&i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

   public static String compress(String str) {
        String newstr = " ";
        for(int i=0;i<str.length();i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1) {
               newstr += count.toString();
            }
        }
        return newstr;
   }
    public static String toupperCase(String str) {
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
             sb.append(str.charAt(i));
             i++;
             sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static int linerrSearch(int arr[],int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int binaryySearch(int num[], int key) {
        int start = 0,end = num.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key) {
                start = mid+1;;
            } else {
              end = mid-1;
            }
        }
        return -1;
    }

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++) {
            if(largest < num[i]) {
                largest = num[i];
            }
            if(smallest > num[i]) {
                smallest = num[i];
            }
            
        }
        System.out.println("smallest value is :"+smallest);
        return largest;
    } 
    
    public static void reverseeArray(int num[]) {
        int start = 0,end = num.length-1;
        while(start < end) {
           int temp = num[end];
           num[end] = num[start];
           num[start] = temp;
           start++;
           end--;
        }
        for(int i=0;i<num.length-1;i++) {
            System.out.println(num[i]+" ");
        }
    } 
    
    public static void kadaness(int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++) {
            cs = cs+num[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our maxsubarray is: "+ms);
    }

    
    public static void main(String args[]) {
       int num[] = {2,4,6,8,10};
       kadaness(num);
    }
}
