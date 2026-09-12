class Solution {
    public String minWindow(String s, String t) {

        int n = s.length();
        int m = t.length();
        int r = 0;
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int index = -1;
        int count = 0;


        if(n<m) return "";
        Map<Character,Integer> mp = new HashMap<>();

        for(Character ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        while(r < n){
            if(mp.containsKey(s.charAt(r))){
                if(mp.get(s.charAt(r))> 0)
                    count += 1;
               mp.put(s.charAt(r),mp.get(s.charAt(r))-1);
            }
            while(count == m){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    index = l;
                }
                if(mp.containsKey(s.charAt(l))){
                    mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
                    if(mp.get(s.charAt(l)) > 0){
                        count -= 1;
                    }
                }
                  l++;
            }
            r++;
        }

        return index==-1?"":s.substring(index,index+minLen);
        
    }
}

