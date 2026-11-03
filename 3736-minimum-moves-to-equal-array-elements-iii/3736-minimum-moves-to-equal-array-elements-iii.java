class Solution {
    public int minMoves(int[] nums) {

       int max=Integer.MIN_VALUE;
        int move=0;

        for(int num:nums){
            max=Math.max(max,num);
        }

        for(int num:nums){
            move+=(max-num);
        }
        return move;
        
    }
}