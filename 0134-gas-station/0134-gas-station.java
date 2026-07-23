class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalgas=0;
        for(int i=0; i<gas.length; i++){
             totalgas+=gas[i];
        }

         int totalcost=0;
         for(int i=0; i<gas.length; i++){
             totalcost+=cost[i];
        }

        if(totalgas<totalcost){
            return -1;
        }

        int start=0;
        int ans=0;
        for(int i=0; i<gas.length; i++){

             ans+=(gas[i]-cost[i]);
             
            if(ans<0){
                start=i+1;
                ans=0;

            }
        }
        return start;
    
    }
}