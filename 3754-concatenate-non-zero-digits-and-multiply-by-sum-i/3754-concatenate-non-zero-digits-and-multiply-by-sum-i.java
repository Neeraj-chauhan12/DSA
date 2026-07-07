class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long rev=0;
        while(n!=0){
            long rem=n%10;
            if(rem!=0){
                sum=sum+rem;
                rev=(rev*10)+rem;
            }
            n=n/10;

        }
        long same=0;
        while(rev!=0){
         long rem=rev%10;
         same=(same*10)+rem;
         rev=rev/10;
        }

        return same*sum;
    }
}