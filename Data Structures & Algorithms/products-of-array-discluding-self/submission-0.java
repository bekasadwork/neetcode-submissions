class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int mult = 1;
            for(int j = 0; j < nums.length; j++) {
                if(j != i) {
                    mult *= nums[j];
                }
            }
            ans[i] = mult;
        }
        return ans;
    }
}  

// s = 1 * 2 * 4 * 6

// 1 -> 2 * 4 * 6
// 2 -> 1 * 4 * 6
// 4 -> 1 * 2 * 6

