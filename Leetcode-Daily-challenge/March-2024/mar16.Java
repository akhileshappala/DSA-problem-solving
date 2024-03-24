// Leetcode link : https://leetcode.com/problems/contiguous-array/description/?envType=daily-question&envId=2024-03-16
class Solution {
    public int findMaxLength(int[] nums) {
        
        int count =0, mCount = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);

        for(int i =0; i < nums.length;i++){
            if(nums[i] == 0) {count -=1;}
            else {count += 1;}
            if(map.containsKey(count)){
                mCount = Math.max(mCount, i-map.get(count));
            }
            else{
                map.put(count,i);
            }
        }
        return mCount;
    }

}
