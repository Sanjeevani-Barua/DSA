1class Solution {
2    public int pivotIndex(int[] nums) {
3        int left=0;
4        int sum=0;
5        
6        for(int i=0;i<nums.length;i++)
7        {
8            sum+=nums[i];
9        }
10
11        if(sum-nums[0]==0)
12        return 0;
13        
14        for(int i=1;i<nums.length;i++)
15        {
16            left+=nums[i-1];
17           int  right=sum-left-nums[i];
18            if(left==right)
19            return i;
20        }
21        return -1;
22    }
23}