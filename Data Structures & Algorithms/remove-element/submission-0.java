class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left  = 0;
        int cnt = 0;

        for(int right = 0; right < n; right++){
            if(nums[right] != val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                cnt++;
            }
        }

        return cnt;
    }
}