public class fibonacciSeries {

    public static void main(String[] args) {
       int input=10;
       int res=getFibonacci(input);
        System.out.println(res);
        // 0 1 1 2 3 5 8 13 21 34 55
    }

    public static int getFibonacci(int num)
    {
        int[] dp=new int[num+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=10;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[num];
    }
}
