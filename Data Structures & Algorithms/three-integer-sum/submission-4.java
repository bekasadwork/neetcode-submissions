class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        Map<Integer, int[]> numSet = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            List<int[]> result = twoSum(i + 1, nums, 0 - nums[i]);
            for(int[] elm: result) {
                ans.add(List.of(nums[i], elm[0], elm[1]));
                numSet.put(nums[i], elm);
            }
        }
        return new ArrayList<>(ans);
    }

    private List<int[]> twoSum(int i, int[] nums, int target) {
        int l = i;
        int r = nums.length - 1;
        List<int[]> targetList = new ArrayList<>();

        while(l < r && r >= 0) {
            if(target == (nums[l] + nums[r])) {
                targetList.add(new int[]{nums[l], nums[r]});
                if(target > (nums[l + 1] + nums[r])) {
                    r--;
                } else {
                    l++;
                }
            }
            else if(target > (nums[l] + nums[r])) {
                l++;
            }
            else {
                r--;
            }
        }
        
        return targetList;
    }
}
