public class MinimumCostPath {

    public static void main(String[] args) {

        int[][] arr={{2,8,4,1,6,4,2},
                {6,0,9,5,3,8,5},
                {1,4,3,4,0,6,5},
                {6,4,7,2,4,6,1},
                {1,0,3,7,1,2,7},
                {1,5,3,2,3,0,9},
                {2,2,5,1,9,8,2}};
        int ans=minimumCostPath(arr);
        System.out.println(ans);
    }

    private static int minimumCostPath(int[][] arr) {
        int[][] dp=new int[arr.length][arr[0].length];
        for (int i=arr.length-1;i>=0;i--)
        {
            for (int j=arr[0].length-1;j>=0;j--)
            {
                if (i==arr.length-1 && j==arr[0].length-1)
                {
                    dp[i][j]=arr[i][j];
                }
                else if (i==arr.length-1)
                {
                    dp[i][j]=arr[i][j]+arr[i][j+1];
                }
                else if(j==arr[0].length-1)
                {
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                else
                {
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
                }
            }
        }
        return dp[0][0];
    }
}
