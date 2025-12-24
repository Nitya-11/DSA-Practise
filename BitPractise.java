public class BitPractise {

//   public static void oddOreven(int n) {
//     int BitMask = 1;
//     if((n & BitMask) == 0) {
//         System.out.println("even number");
//     } else {
//         System.out.println("odd number");
//     }
//   }

  public static int findBits(int n, int i) {
    int BitMask = 1 << i;
    if((n & BitMask) != 0) {
        return 1;
    }
    return 0;
  }
  public static boolean powerValue(int n) {
    if((n&(n-1)) == 0){
      return true;
    } else {
        return false;
    }
  }

  //Desecnding order
  public static void printDec(int n) {
    if(n==1) {
      System.out.println(n);
      return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }

  //Ascending order
  public static void printAsc(int n) {
    if(n==1) {
      System.out.println(n);
      return;
    }
    printAsc(n-1);
    System.out.println(n);
  }
   // print n numbers
  public static void printNum(int n) {
    if(n==0) {
      return;
    }
    System.out.println(n);
    printNum(n-1);
  }
  
  public static void main(String args[]) {
   int n = 4;
   printNum(n);
  }  
}
