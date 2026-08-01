class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int min=Integer.MAX_VALUE;
        int max=0;
        while(j<=nums.length){
            min=Math.min(nums[i],nums[j]);
            max+=min;
            i=i+2;
            j=j+2;
        }
        return max;
    }
}