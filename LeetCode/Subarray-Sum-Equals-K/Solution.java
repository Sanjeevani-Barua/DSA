1class Solution {
2    public int subarraySum(int[] nums, int k) {
3  
4        int sum=0;
5        int res=0;
6        int freq=0;
7        HashMap<Integer, Integer> map=new HashMap<>();
8        map.put(0,1);
9        for(int i=0;i<nums.length;i++)
10        {
11            sum+=nums[i];
12            int ques=sum-k;
13             freq=map.getOrDefault(ques,0);
14            res+=freq;
15            map.put(sum, map.getOrDefault(sum,0)+1);
16        }
17
18        return res;
19    }
20}
21    
22