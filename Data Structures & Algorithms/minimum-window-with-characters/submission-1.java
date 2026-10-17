class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> need  = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++){
            char curr = t.charAt(i);
            need.put(curr,need.getOrDefault(curr,0)+1);
        }
        
        HashMap<Character,Integer> window = new HashMap<>();
        int left = 0 ;
        int formed = 0;
        int ans[] = {-1,0,0};

        for(int right = 0 ; right < s.length() ; right++){
            char curr = s.charAt(right);
            window.put(curr,window.getOrDefault(curr,0)+1);

            if (need.containsKey(curr) && window.get(curr).intValue() == need.get(curr).intValue()) {
                formed++;
            }

            //shrink window
            while(left <= right && formed == need.size()){
                curr = s.charAt(left);

                if(ans[0] > right - left+1 || ans[0] == -1){
                    ans[0] = right - left +1 ;
                    ans[1] = left;
                    ans[2] = right;
                }
                
                window.put(curr,window.get(curr)-1);
                if(need.containsKey(curr) && window.get(curr).intValue() < need.get(curr).intValue()){
                    formed--;
                }

                left++;
            }
        }
        return ans[0] == -1 ? "" : s.substring(ans[1],ans[2]+1);
    }
}
