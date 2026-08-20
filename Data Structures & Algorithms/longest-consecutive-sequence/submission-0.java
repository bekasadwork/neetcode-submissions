class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) {
            return 0;
        }

        int ans = 0;
        int count = 0;
        int prev = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if(n == prev + 1) {
                count++;
            }
            ans = Math.max(count, ans);
            if (n > prev + 1){
                count = 0;
            }
            prev = n;
        }

        return Math.max(count, ans) + 1;

        // Map<Integer, Boolean> mp = new HashMap<>();
        // int ans = 0;
        // int count = 0;
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // for(int n: nums) {
        //     mp.put(n, true);
        // }

        // for(int i = -1000000000; i <= 1000000000; i++) {
        //     if(!mp.containsKey(i)) {
        //         ans = Math.max(ans, count);
        //         count = 0;
        //     }
        //     else {
        //         count++;
        //     }
        // }

        // return ans;
    }
}
