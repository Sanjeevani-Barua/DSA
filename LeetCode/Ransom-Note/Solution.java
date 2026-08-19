1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int freq[]=new int[26];
4        for(char ch:magazine.toCharArray())
5        {
6            freq[ch-'a']++;
7        }
8        for(char c:ransomNote.toCharArray())
9        {
10            freq[c-'a']--;
11            if(freq[c-'a']<0)
12            return false;
13        }
14        return true;
15
16    }
17}