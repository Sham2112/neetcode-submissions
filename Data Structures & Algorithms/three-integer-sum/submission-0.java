class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> added = new HashSet<>();

        for(int i = 0; i<l; i++){
            int target = 0 - nums[i];

            int j = i+1;
            int k = l-1;

            while (j < k){
                if (nums[j] + nums[k] > target){
                    k--;
                } else if (nums[j] + nums[k] < target){
                    j++;
                } else {
                    List<Integer> r = new ArrayList<>();
                    r.add(nums[i]);
                    r.add(nums[j]);
                    r.add(nums[k]);
                    added.add(r);
                    j++;
                    k--;
                }
            }
        }

        for(List<Integer> r: added){
            result.add(r);
        }

        return result;
    }

}
