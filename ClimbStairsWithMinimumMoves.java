public class ClimbStairsWithMinimumMoves {

    public static void main(String[] args) {
        int n=13;
        int[] steps={5,5,2,4,1,5,9,8,6,3,8,9,1};
        Integer[] dp=new Integer[n+1];
        dp[n]=0;
        for (int i=n-1;i>=0;i--) {

            if (steps[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j <= steps[i] && i + j < dp.length; j++) {
                    if (dp[i + j]!=null)
                        min = Math.min(min, dp[i + j]);
                }
                if (min!=Integer.MAX_VALUE)
                    dp[i]=min+1;
                else
                    dp[i]=null;
             }

        }
    }
}
