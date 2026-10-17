class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < strs.size() ; i++){
            String curr = strs.get(i);
            str.append((char)curr.length()).append(curr);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0 , n = str.length();

        while(i < n){
            int size = (int)str.charAt(i++);
            ans.add(str.substring(i,i+size));
            i += size;
        }
        return ans;
    }
}
