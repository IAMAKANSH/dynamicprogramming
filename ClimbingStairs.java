public class ClimbingStairs {


    public static void main(String[] args) {
        int[] dp=new int[11];
        int ans=countPaths(10,dp);
        System.out.println(ans);
    }

    public static int countPaths(int number,int[] dp)
    {
        if (number==0)
            return 1;

        else if (number<0)
            return 0;
        else if(dp[number]>0)
            return dp[number];
        System.out.println(number);
        int n1=countPaths(number-1,dp);
        int n2=countPaths(number-2,dp);
        int n3=countPaths(number-3,dp);
        int sum=n1+n2+n3;
        dp[number]=sum;
        return sum;
    }
}
