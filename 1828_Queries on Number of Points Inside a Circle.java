class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length, m = points.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        for (int i = 0; i < n; i++) {
            int x = queries[i][0], y = queries[i][1], r = queries[i][2];
            for (int j = 0; j < m; j++) {
                int px = points[j][0], py = points[j][1];
                if ((px - x) * (px - x) + (py - y) * (py - y) <= r * r)
                    ans[i]++;
            }
        }
        return ans;
    }
}
