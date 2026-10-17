class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> check1 = new HashMap<>();
        HashMap<Character,Integer> check2 = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            check1.put(s.charAt(i),check1.getOrDefault(s.charAt(i),0)+1);
            check2.put(t.charAt(i),check2.getOrDefault(t.charAt(i),0)+1);
        }
        return check1.equals(check2);
    }
}
