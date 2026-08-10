1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for (int i = 0; i < s.length(); i++) {
6            char ch = s.charAt(i);
7
8            if (ch == '(' || ch == '[' || ch == '{') {
9                st.push(ch);
10            } 
11            else
12            {
13                if (st.isEmpty()) {
14                    return false;
15                }
16
17                if ((ch == ')' && st.peek() == '(') ||
18                    (ch == ']' && st.peek() == '[') ||
19                    (ch == '}' && st.peek() == '{')) {
20                    st.pop();
21                } 
22                else {
23                    return false;
24                }
25            }
26        }
27
28        return st.isEmpty();
29    }
30}