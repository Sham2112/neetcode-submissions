class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int i = 0;
        int j = len-1;

        int maxArr = 0;

        while (i < j){
            int arr = Math.min(heights[i], heights[j]) * (j-i);
            maxArr = Math.max(arr, maxArr);

            if (heights[j] <= heights[i]){
                j--;
            } else {
                i++;
            }
        }

        return maxArr;
        
    }
}
