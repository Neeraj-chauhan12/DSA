class Solution {
    public int climbStairs(int n) {

        if(n<=2){
            return n;
        }

        int firststep=2;
        int twostep=1;
        int allways=0;

        for(int i=3; i<=n; i++){
            allways=firststep+twostep;
            twostep=firststep;
            firststep=allways;

        }
        return allways;
        
    }
}