class Solution {
    public int[] twoSum(int[] nums, int target) {

       int s=0;
       int e=nums.length-1;

       while(s<=e){
        int sum=nums[s]+nums[e];

        if(sum<target){
            s++;
        }
        else if(sum>target){
            e--;
        }
        else{
            return new int[] {++s, ++e};
        }
       }
        
        return new int[] {-1,-1};
    }
}