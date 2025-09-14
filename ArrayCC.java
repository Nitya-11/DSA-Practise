
// public class ArrayCC {

//     public static void printLetters(String str) {
//         for(int i=0;i<str.length();i++) {
//             System.out.print(str.charAt(i)+" ");
//         }
//         System.out.println();
//     }

//     public static boolean isPalindrome(String str) {
//         for(int i=0;i<str.length()/2;i++) {
//            int n = str.length();
//            if(str.charAt(i) != str.charAt(n-1-i)) {
//             //not a palinedrome
//             System.out.print("not a palinedrome");
//             return false;
//            } 
//         }
//         System.out.print(" palinedrome");
//         return true;
        
//     }
//     public static float findPath(String path) {
//         int x=0,y=0;

//        for(int i=0;i<path.length(); i++) {
//             char dir = path.charAt(i);
//           //South 
//           if(dir == 'S') {
//             y--;
//           }
//           //North
//           else if(dir =='N') {
//             y++;
//           }
//           //West
//           else if(dir == 'W'){
//             x--;
//           }
//           //East 
//           else {
//             x++;
//           }
//         }
//         int x2 = x*x;
//         int y2 = y*y;
//         return (float)Math.sqrt(x2 + y2);
//     }
//     // public static String substring(String str, int si, int ei) {
//     //     String substr = "";
//     //     for(int i=si;i<ei;i++) {
//     //         substr += str.charAt(i);
//     //     }
//     //     return substr;
//     // }

//      public static String MergedStrings(String word1, String word2) {

//         StringBuilder result = new StringBuilder();
//         int i=0;
//         while(i<word1.length() || i<word2.length()) {
//             result.append(word1.charAt(i));
//         }
//         if(i<word2.length()) {
//             result.append(word2.charAt(i));
//         }
//         i++;
//     }
//     return result.toString();
public class ArrayCC {

     public static int rotateSorted(int arr[],int target) {
       int start = 0, end = arr.length-1;
       while(start <= end) {
        int mid = start+(end-start)/2;
        if(arr[mid] == target) {
          return mid;
        }
        //left sorted
        if(arr[start]<= arr[mid]) {
           if(arr[start]<= target && target <= arr[mid]) {
            end = mid - 1;
           } else {
            start = mid+1;
           }


        } else { //right sorted
          if(arr[mid] <= target && target <= arr[end]) {
            start = mid+1;
          } else {
            end = mid-1;
          }
        }

       }
       return -1;

      }
    public  static void main(String args[]) {
       int arr[] = {4,5,6,7,0,1,2};
       int target = 0;
      System.out.println(rotateSorted(arr, target));
    }
  }
