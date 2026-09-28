class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            char lc = s.charAt(left);
            char rc = s.charAt(right);
            if(!isAlphanumeric(lc)) {
                left++;
                continue;
            }
            if(!isAlphanumeric(rc)) {
                right--;
                continue;
            }
            if(Character.toLowerCase(lc) != Character.toLowerCase(rc)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    private static boolean isAlphanumeric(char ch) {
        return Character.isLetter(ch) || Character.isDigit(ch);
    }
}
