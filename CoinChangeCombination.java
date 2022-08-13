public class CoinChangeCombination {

    public static void main(String[] args) {

        int[] arr={1,2,3};
        int target=4;
        int ans=coincombinationPossible(arr,target);
        System.out.println(ans);
    }

    private static int coincombinationPossible(int[] arr, int target) {
        int[][] dp=new int[arr.length+1][target+1];
        for (int i=0;i<dp.length;i++)
        {
            for (int j=0;j<dp[0].length;j++)
            {
                if (i==0 && j==0)
                {
                    dp[i][j]=1;
                }
                else  if (i==0)
                {
                    dp[i][j]=0;
                }
                else if (j==0)
                {
                    dp[i][j]=1;
                }
                else
                {
                    int val=arr[i-1];
                    if (val>j)
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j]+dp[i][j-val];
                    }
                }

            }
        }
        return dp[arr.length][target];
    }
}
