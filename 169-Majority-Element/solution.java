public class Solution {
    public int majorityElement(int[] nums) {
        int res = 0, count = 0;
        for (int i=0;i<nums.length;i++){
            if(count == 0){
                res = nums[i];
                count = 1;
            }else if (res == nums[i]) count++;
            else count--;
        }
        
        return res;
    }
}