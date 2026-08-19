1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        int[] freq=new int[26];
5        for(char ch:s.toCharArray())
6        {
7             freq[ch-'a']++;
8        }
9
10        for(int i=0;i<s.length();i++)
11        {
12            if(freq[s.charAt(i)-'a']==1)
13            {
14                return i;
15               
16            }
17        }
18
19        return -1;
20    }
21}