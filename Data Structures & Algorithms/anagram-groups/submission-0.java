class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagrams = new HashMap<>();
        
        for(int i = 0 ; i < strs.length ; i++){

            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sortedKey = new String(charArr);

            anagrams.putIfAbsent(sortedKey,new ArrayList<>());
            anagrams.get(sortedKey).add(strs[i]);

        }

        return new ArrayList<>(anagrams.values());

    }
}
