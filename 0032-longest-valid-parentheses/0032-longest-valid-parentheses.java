class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int max=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int i=0;
        while(i<n){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    max=Math.max(max,i-stack.peek());
                }
                else{
                    stack.push(i);
                }
            }
            i++;
        }
        return max;
    }
}