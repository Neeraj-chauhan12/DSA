class Solution {
    public int maximumGap(int[] nums) {

        if(nums.length==1)return 0;

        Arrays.sort(nums);

       int diff=0;
        int i=0;
        while(i+1<nums.length){
          int min=0;
          min=nums[i+1]-nums[i];
          diff=Math.max(diff,min);
          i++;

        }
        return diff;
        
    }
}