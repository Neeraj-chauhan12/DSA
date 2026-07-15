class Solution {
    public int gcdOfOddEvenSums(int n) {

        int evenSum=n*(n+1);
        int oddSum=n*n;

        int max=Math.max(evenSum,oddSum);
        int min=Math.min(evenSum,oddSum);

        return max-min;
       
    }

  
}