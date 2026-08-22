class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
         int longest = 0;

         for(int num:nums){
            int count =0;
            if(!set.contains(num-1)){
                int current = num;
                 count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
            }
            longest = Math.max(longest,count);
         }

         return longest;
    }
}
