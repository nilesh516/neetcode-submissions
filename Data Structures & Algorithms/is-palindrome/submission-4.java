class Solution {
    public boolean isPalindrome(String s) {

        String str = s.replace(" ","").toLowerCase();

        int l = 0;
        int r = str.length() - 1;
        if(str.length()<2) return true;

        while(l<=r){
            while(!Character.isLetterOrDigit(str.charAt(l)) && l < r){
                l++;
            }
            while(!Character.isLetterOrDigit(str.charAt(r)) && l < r){
                r--;
            }
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

       return true; 
    }
}
