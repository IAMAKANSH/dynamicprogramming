public class CoinChangePermutation {

    public static void main(String[] args) {

        int target=7;
        int[] arr={2,3,5,6};
        int ans=coinPermutation(arr,target);
        System.out.println(ans);
    }

    private static int coinPermutation(int[] arr, int target) {

        int[] dp=new int[target+1];
        dp[0]=1;
        for (int i=0;i<dp.length;i++)
        {
            int total=0;
            for (int j=0;j<arr.length;j++)
            {
                if (i>=arr[j])
                {
                    total +=dp[i-arr[j]];
                }
            }
            if(total!=0)
                dp[i]=total;
        }
        return dp[target];
    }
}
