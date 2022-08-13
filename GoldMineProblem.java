public class GoldMineProblem {

    public static void main(String[] args) {

        int[][] arr={
                {0,1,4,2,8,2},
                {4,3,6,5,0,4},
                {1,2,4,1,4,6},
                {2,0,7,3,2,2},
                {3,1,5,9,2,4},
                {2,7,0,8,5,1},
        };
        int ans=maxGoldCollected(arr);
        System.out.println(ans);
    }

    private static int maxGoldCollected(int[][] arr) {
        int[][] dp=new int[arr.length][arr[0].length];

        for (int i=0;i< arr.length;i++)
        {
            for (int j=arr[0].length-1;j>=0;j--)
            {
                if (j==arr[0].length-1)
                {
                    dp[i][j]=arr[i][j];
                }
                else if (i==0)
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1])+arr[i][j];
                }
                else if(i==arr.length-1)
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i-1][j+1])+arr[i][j];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j+1],Math.max(dp[i+1][j+1],dp[i-1][j+1]))+arr[i][j];
                }
            }
        }
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            ans=Math.max(ans,dp[i][0]);
        }
        return ans;
    }
}
