class Solution {
    public int majorityElement(int[] nums) {
        return find(nums);
    }

    public int find(int nums[]){

        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        Set<Integer> keySet=hm.keySet();
        for(Integer key:keySet){
            if(hm.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}