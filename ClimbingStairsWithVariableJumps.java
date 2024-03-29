public class ClimbingStairsWithVariableJumps {

    public static void main(String[] args) {
        int n=13;
        int[] steps={5,5,2,4,1,5,9,8,6,3,8,9,1};
        int[] dp=new int[n+1];
        dp[n]=1;
        for (int i=n-1;i>=0;i--)
        {
            for (int j=0;j<=steps[i]&& i+j<dp.length;j++)
            {
                dp[i] +=dp[i+j];
            }
        }
        System.out.println(dp[0]);
    }

}
