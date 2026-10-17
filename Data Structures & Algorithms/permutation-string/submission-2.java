class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        Map<Character,Integer> count1 = new HashMap<>();
        for(char c : s1.toCharArray()){
            count1.put(c,count1.getOrDefault(c,0)+1);
        }

        int l = 0 ;

        Map<Character,Integer> window = new HashMap<>();
        for(int r = 0 ; r < s2.length() ; r++){
            window.put(s2.charAt(r),window.getOrDefault(s2.charAt(r),0)+1);
            while(r-l+1 >  s1.length()){
                if(window.get(s2.charAt(l)) == 1){
                    window.remove(s2.charAt(l));
                }
                else{
                    window.put(s2.charAt(l),window.get(s2.charAt(l))-1);
                }
                l++;
            }
        if(r-l+1 == s1.length() && count1.equals(window)){
            return true;
        }
        }
        return false;
    }
}