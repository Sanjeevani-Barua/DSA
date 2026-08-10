1class Solution {
2    public String removeDuplicates(String s) {
3        int n=s.length();
4        
5        Stack<Character> st=new Stack<>();
6         st.push(s.charAt(0));
7        for(int i=1;i<n;i++)
8        {
9            if(!st.isEmpty() && s.charAt(i)==st.peek())
10            {
11                st.pop();
12            }
13            else
14            {
15            st.push(s.charAt(i));}
16        }
17        
18        StringBuilder sb = new StringBuilder();
19
20            while (!st.isEmpty()) {
21                sb.append(st.pop());
22            }
23
24            return sb.reverse().toString();
25    }
26}