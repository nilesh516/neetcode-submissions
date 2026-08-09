class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        

        for(int i = 0 ; i < nums.length; i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> mpList = new ArrayList<>(mp.entrySet());
        mpList.sort(Map.Entry.<Integer,Integer> comparingByValue().reversed());

        int[] ans = new int[k];
        for( int i = 0 ; i < k; i++){
            ans[i] = mpList.get(i).getKey();
        }

        
       return ans;
        
    }
}
