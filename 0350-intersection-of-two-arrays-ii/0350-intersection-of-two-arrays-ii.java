class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer>map=new HashMap<>();
        for(int num: nums2){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>arr=new ArrayList<>();
        
        for(int num: nums1){
            if(map.containsKey(num)){
                int curr=map.get(num);
                if(curr>0){
                    map.put(num,curr-1);
                    arr.add(num);
                
                }
            }
        }
        int[] ans=new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
              ans[i]=arr.get(i);
        }
        return ans;
    }
}