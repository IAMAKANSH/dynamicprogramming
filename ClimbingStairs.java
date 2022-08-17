public class ClimbingStairs {


    public static void main(String[] args) {
        String sentence ="can you give me 10 bucks puff in 7.5 or 7";
        StringBuilder stringBuilder=new StringBuilder(sentence);
        String c=stringBuilder.reverse().toString();
        System.out.println(c);
        String[] str=sentence.split(" ");
        int string=0;
        int integer=0;
        int doublee=0;
        for (String s:str
             ) {
            if (s.matches("\\d+")){
                integer++;
            }
            else if(s.matches("[A-Za-z]+"))
            {
                string++;
            }
            else{
                doublee++;
            }
        }
        System.out.println(string);
        System.out.println(integer);
        System.out.println(doublee);
        int a=0x000F;
        int b=0x2222;
        System.out.println(a&b);
        int sum=0;
        sum >>=1;
        sum <<=1;
        System.out.println(sum);
        int[] dp=new int[6];
        int ans=countPaths(5,dp);
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
        //int n3=countPaths(number-3,dp);
        int sum=n1+n2;
        dp[number]=sum;
        return sum;
    }
}
