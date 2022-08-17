public class UnboundedKnapsackProblem {
    public static void main(String[] args) {


        int[] arr={2,5,1,3,4};
        int[] weight={15,14,10,45,30};

        int target=7;
        int[] dp=new int[target+1];
        for (int i=0;i<=target;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                if(arr[j]<=i)
                {
                    dp[i]=Math.max(dp[i],weight[j]+dp[i-arr[j]]);
                }
            }
        }
        System.out.println(dp[target]);
    }
}
