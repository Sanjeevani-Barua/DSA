1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        int n=nums.length;
4        int sum=0;
5        
6       Arrays.sort(nums);
7        List<List<Integer>> list=new ArrayList<>();
8        for(int i=0;i<n-2;i++)
9        {
10            if(i>0 && nums[i]==nums[i-1])
11            continue;
12            int l=i+1;
13            int r=n-1;
14            while(l<r)
15            {
16               sum=nums[i]+nums[l]+nums[r];
17               if(sum==0)
18               {
19                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
20                     l++;
21                        while (l < r && nums[l] == nums[l - 1])
22                            l++;
23
24                        r--;
25                        while (l < r && nums[r] == nums[r + 1])
26                            r--;
27               }
28               else if(sum<0)
29               {
30                l++;
31                 while(l<r && nums[l]==nums[l-1])
32                 l++;
33               }
34               else
35               {
36                r--;
37                while(l<r && nums[r]==nums[r+1])
38                r--;
39               }
40            }
41        }
42        return list;
43    }
44}