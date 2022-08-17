public class CountBinaryStrings {

    public static void main(String[] args) {
        int n=6;
        int[] zero=new int[n+1];
        int[] one=new int[n+1];
        zero[1]=1;
        one[1]=1;
        for (int i=2;i<=n;i++)
        {
            one[i]=one[i-1]+zero[i-1];
            zero[i]=one[i-1];
        }
        System.out.println(zero[n]+one[n]);
    }
}
