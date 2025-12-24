public class MajorityElement {
    public static void main(String args[]) {
        int[] nums = {3,4,3,3,4,4,3,2,2,2,2};
        System.out.print(Majority(nums));
    }
    public static int Majority (int[] nums) {
        int freq = 0, ans = 0;
        for(int i=0;i<nums.length;i++) {
            if(freq == 0) {
                ans= nums[i];
            }
            if(ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }
}