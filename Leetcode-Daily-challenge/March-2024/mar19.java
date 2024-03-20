// link : https://leetcode.com/problems/task-scheduler/?envType=daily-question&envId=2024-03-19

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int max =0;
        for (char task : tasks){
            freq[task-'A']++;
          //finding the max frequent one
            max= Math.max(max, freq[task-'A']);
        }

        int sameMaxFreq = 0;
        for (int frequency : freq){
            if(frequency == max){
              //finding how many have the same maximum frequency
                sameMaxFreq++;
            }
        }

        int interval = Math.max((n+1)*(max-1) + sameMaxFreq, tasks.length);

        return interval;
    }
}
