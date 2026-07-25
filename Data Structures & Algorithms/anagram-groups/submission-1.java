class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        //iterate through array

        for (String s : strs){
            // create a char array named chars, creates list of the strings letters
            char[] chars = s.toCharArray();
            // needs to be sorted 
            Arrays.sort(chars);
            // needs to be turned into a string named key to mapabstract
            String key = new String(chars);
    

        // need to map key to value
        // if map does not have a key, create a new array list  
        if (! map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        // if it does exist 

        map.get(key).add(s);

    }
    return new ArrayList<>(map.values());
    }
}
