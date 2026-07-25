class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        int n = strs.length;
        HashMap<String,List<String>> hash = new HashMap<>();

        for(int i = 0 ; i < n; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

           if(hash.containsKey(sorted)){
            hash.get(sorted).add(strs[i]);

           }else{
            hash.put(sorted,new ArrayList<>());
            hash.get(sorted).add(strs[i]);
           }

        }

        for(List<String> value: hash.values()){
            result.add(value);
        }
        return result;
        
    }
}
