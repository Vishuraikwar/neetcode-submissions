class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append((char)s.length()).append(s);
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
