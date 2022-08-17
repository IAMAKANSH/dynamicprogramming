public class KnapsackProblem {

    public static void main(String[] args) {

        int target=7;
        int[] coins={2,5,1,3,4};
        int[] weights={15,14,10,45,30};
        int max=maxWeightPossible(coins,weights,target);
        System.out.println(max);
    }

    private static int maxWeightPossible(int[] coins, int[] weights, int target) {

        int[][] dp=new int[coins.length+1][target+1];

        for (int i=0;i<=coins.length;i++)
        {
            for (int j=0;j<=target;j++)
            {
                if (i==0 && j==0)
                    dp[i][j]=0;
                else if(i==0)
                    dp[i][j]=0;
                else if(j==0)
                    dp[i][j]=0;
                else
                {
                    int coin=coins[i-1];
                    int weight=weights[i-1];

                    if (j>=coin)
                    {
                        dp[i][j]=Math.max(dp[i-1][j],weight+dp[i-1][j-coin]);
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        return dp[coins.length][target];
    }
}
