class Solution {
    public int findKthLargest(int[] nums, int k) {
       
       
       Arrays.sort(nums);
       PriorityQueue<Integer>pq=new PriorityQueue<>();

       return nums[nums.length-k];
        
    }
}