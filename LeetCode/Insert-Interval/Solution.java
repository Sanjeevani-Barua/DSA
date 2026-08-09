1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3
4        List<int[]> ans = new ArrayList<>();
5        boolean inserted = false;
6
7        // Step 1: Insert newInterval in sorted position
8        for (int i = 0; i < intervals.length; i++) {
9
10            if (!inserted && newInterval[0] < intervals[i][0]) {
11                ans.add(new int[]{newInterval[0], newInterval[1]});
12                inserted = true;
13            }
14
15            ans.add(new int[]{intervals[i][0], intervals[i][1]});
16        }
17
18        // If newInterval belongs at the end
19       if (!inserted) { 
20        ans.add(new int[]{newInterval[0], newInterval[1]}); 
21        }
22
23        // Step 2: Merge intervals in ans
24        List<int[]> result = new ArrayList<>();
25
26        int st1 = ans.get(0)[0];
27        int end1 = ans.get(0)[1];
28
29        for (int i = 1; i < ans.size(); i++) {
30
31            int st2 = ans.get(i)[0];
32            int end2 = ans.get(i)[1];
33
34            if (end1 >= st2) {
35                // Overlap
36                end1 = Math.max(end1, end2);
37            } 
38            else {
39                // No overlap
40                result.add(new int[]{st1, end1});
41
42                st1 = st2;
43                end1 = end2;
44            }
45        }
46
47        // Add last interval
48        result.add(new int[]{st1, end1});
49
50        return result.toArray(new int[result.size()][]);
51    }
52}
53
54