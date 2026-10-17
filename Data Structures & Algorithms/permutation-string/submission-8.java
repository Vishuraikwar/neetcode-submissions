class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i++){
            char curr = s1.charAt(i);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }

        HashMap<Character,Integer> mp = new HashMap<>();
        int left = 0 ;
        for(int right = 0 ; right < s2.length() ; right++){
            char curr = s2.charAt(right);
            mp.put(curr,mp.getOrDefault(curr,0)+1);

            if((right-left+1) > s1.length()){
                mp.put(s2.charAt(left),mp.getOrDefault(s2.charAt(left),0)-1);
                if(mp.get(s2.charAt(left)) == 0) mp.remove(s2.charAt(left));
                left++;
            }
            if((right-left+1) == s1.length() && mp.equals(map)){
                return true;
            }
        }
        return false;
    }
}
