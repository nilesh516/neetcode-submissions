class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] hash1= new int[26];
        int[] hash2= new int[26];
        int l = 0;

        if(s1.length()>s2.length()){
            return false;
        }

        for(int i = 0 ;i < s1.length();i++){
            hash1[s1.charAt(i)-'a']++;
        }
        int windowSize = s1.length();
        for(int i = 0; i < s2.length(); i++ ){
            if(i-l+1 > windowSize){
                hash2[s2.charAt(l)-'a']--;
                l++;
            }
             hash2[s2.charAt(i)-'a']++;
            if(Arrays.equals(hash1,hash2)){
            return true;
             }
        }
        return false;
        
    }
}
