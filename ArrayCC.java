import java.util.*;

public class ArrayCC {
  public static int trappedRainWater(int height[]) {
    //left max array
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for(int i= 1;i < height.length;i++) {
      leftMax[i] = Math.max(height[i],leftMax[i-1]);
    }
    //right max array
    int rightMax[] = new int[height.length];
    rightMax[height.length-1] = height[height.length-1];
    for(int i = height.length-2;i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    //loop
    int trappedWater = 0;
    for(int i=0;i < height.length; i++) {
      int waterlevel = Math.min(rightMax[i],leftMax[i]);
      trappedWater += waterlevel - height[i];
    }
    return trappedWater;
    //waterlevel
    //trappedrainwater
  }

public static void main(String args[]) {
  int height[] = {-2,-3,4,-1,-2,1,5,-3};
  System.out.println(trappedRainWater(height));
 }
}