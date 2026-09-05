class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n<1) return 0;
        int l = 0;
        int r = 0;
        int length =0;
        Map<Character,Integer> mp = new HashMap<>();
        // mp.put(s.charAt(0),1);
        while(r < n){
            char c = s.charAt(r);
            while(mp.containsKey(c)){
                mp.remove(s.charAt(l));
                l++;
            }
                mp.put(c,1);
            
            length = Math.max(length,r-l+1);
            r++;

        }
        return length;
        
    }
}
