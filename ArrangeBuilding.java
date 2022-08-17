public class ArrangeBuilding {

    public static void main(String[] args) {

        int n=5;
        int[] space=new int[n+1];
        int[] building=new int[n+1];

        space[1]=1;building[1]=1;

        for (int i=2;i<=n;i++)
        {
            space[i]=space[i-1]+building[i-1];
            building[i]=space[i-1];
        }
        System.out.println(Math.pow(space[n]+building[n],2));
    }
}
