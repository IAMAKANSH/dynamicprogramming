import java.util.HashSet;

public class MinimumSteps {

    public static void main(String[] args) {

        int X=4;
        int Y=128;
        HashSet<Integer> hashSet=new HashSet<>();
        int[] arr=new int[1];
        minimumSteps(X,Y,hashSet,arr);

        System.out.println(arr[0]);
    }

    private static void minimumSteps(int x, int y,HashSet<Integer> hashSet,int[] arr) {
        if (x==y)
            return;
        if (!hashSet.add(x))
        {
            arr[0]=-1;
            return;
        }
        else if (x>y)
        {
            arr[0]=arr[0]+1;
            minimumSteps(x/2,y,hashSet,arr);
        }
        else{
            arr[0]=arr[0]+1;
            minimumSteps(x*2,y,hashSet,arr);
        }
    }
}
