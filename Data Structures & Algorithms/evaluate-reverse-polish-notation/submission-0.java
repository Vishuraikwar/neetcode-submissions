class Solution {
    public Stack<Integer> stack ;
    public int evalRPN(String[] tokens) {
        stack = new Stack<>();
        for(int i = 0 ; i < tokens.length ; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else{
                if(tokens[i].equals("+")){
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a+b);
                }
                else if(tokens[i].equals("-")){
                    int b = stack.pop();
                    int a = stack.pop();
                     stack.push(a-b);
                }
                else if(tokens[i].equals("*")){
                    int b = stack.pop();
                    int a = stack.pop();
                     stack.push(a*b);
                }
                else if(tokens[i].equals("/")){
                    int b = stack.pop();
                    int a = stack.pop();
                     stack.push(a/b);
                }
            }
        }
        return stack.pop();
    }
}
