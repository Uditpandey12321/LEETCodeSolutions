class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        for(int i=0;i<nums.length;i++){
            int currmul =1;
            for(int j=i;j<nums.length;j++){
                currmul = currmul*nums[j];
                res=Math.max(res, currmul);
            }
        }
        return res;
    }
}