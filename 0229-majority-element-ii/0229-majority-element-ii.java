class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int key:map.keySet()){
            int value=map.get(key);
            if(value>n/3){
              ans.add(key);
            }
        }
        return ans;
    }
}