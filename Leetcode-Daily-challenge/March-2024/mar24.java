https://leetcode.com/problems/find-the-duplicate-number/description/?envType=daily-question&envId=2024-03-24


class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return -1;
    }
}
