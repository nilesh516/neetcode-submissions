class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int element = 0;
        // int res = 0;

        for(int i=0;i<n;i++){
            int currElement = nums[i];
            if(cnt == 0){
                element = currElement;
                cnt = 1;
            } else if(element != currElement){
                cnt--;
            }else{
                cnt++;
            }

        }
        return element;
        
    }
}