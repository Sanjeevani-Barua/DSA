1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int freq[]=new int[26];
4      
5       
6       
7        for(char ch:text.toCharArray())
8        {
9            freq[ch-'a']++;
10        }
11
12            int count = Math.min(freq['b' - 'a'], freq['a' - 'a']);
13            count = Math.min(count, freq['l' - 'a'] / 2);
14            count = Math.min(count, freq['o' - 'a'] / 2);
15            count = Math.min(count, freq['n' - 'a']);
16        return count;
17    }
18}