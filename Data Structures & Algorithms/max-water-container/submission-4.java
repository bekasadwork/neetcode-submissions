class Solution {
    public int maxArea(int[] h) {
       int ans = 0;
       int l = 0;
       int r = h.length - 1;

       while(l < r) {
            int temp = area(l, r, h);
            ans = Math.max(temp, ans);
            if(h[l] < h[r]) {
                l++;
            }
            else {
                r--;
            }

       }
       return ans;
    }

    private static int area(int l, int r, int[] h) {
        return (r - l) * Math.min(h[l], h[r]);
    }
}
