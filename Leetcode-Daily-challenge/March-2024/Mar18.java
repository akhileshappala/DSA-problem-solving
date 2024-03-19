// link : https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/?envType=daily-question&envId=2024-03-18

class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points, Comparator.comparingInt(point -> point[0])); 

       int noOfArrows = 1 ;
        int end = points[0][1];

        for (int i =1; i <points.length;i++){
            int currStart = points[i][0];
            int currEnd = points[i][1];

            if(end < currStart){
                noOfArrows++;
                end = currEnd;
            }
            else{
                end = Math.min(end,currEnd);
            }
        }
        return noOfArrows;
    }
}
