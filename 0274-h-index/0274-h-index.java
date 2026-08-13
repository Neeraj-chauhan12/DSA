class Solution {
    public int hIndex(int[] citations) {
        
        // Arrays.sort(citations);
        // int n=citations.length;
        // for(int i=0; i<n; i++){
        //     int h=n-i;

        //     if(citations[i]>=h){
        //         return h;
        //     }
        // }
        // return 0;

        int n=citations.length;
        int[] bucket=new int[n+1];

        for(int c: citations){
            if(c>=n){
                bucket[n]++;

            }else{
                bucket[c]++;

            }
        }

        int total=0;
        for(int i=n; i>=0; i--){
            total+=bucket[i];
            if(total>=i){
                return i;
            }
        }
        return 0;
    }
}