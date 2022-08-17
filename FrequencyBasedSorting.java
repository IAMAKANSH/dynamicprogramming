import java.util.*;

public class FrequencyBasedSorting {
    public static  void checing(int x,int y)
    {
        x=100;
        y=200;
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        checing(a,b);
        String text="Cut";
        display(text);
        text +="Short!";
        display(text);

        Foo foo=new Foo();
        System.out.println(foo.getData());

//        int A[] = {5,5,5,4,6,4};
//        List<Integer> ans= frequencySorting(A);
//        System.out.println(ans);
//        Map<Integer,Integer> seen=new HashMap<>();
int[] arr={1 ,2 ,3 ,7 ,5};
        System.out.println(subarraySum(arr,arr.length,12));
    }

    private static void display(String text) {
        System.out.print(text);
        text +=" ";
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int ele=arr[i];
            int remaining=s-ele;
            if(map.containsKey(remaining))
            {
                list.add(i+1);
                list.add(map.get(remaining)+1);
                break;
            }
            else{
                map.put(ele,i);
            }
        }
        return list;
    }
    public static long shortestUnorderedSubarray(long arr[], long n)
    {
        long start=0;
        long end=0;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                min=Math.min(min,arr[i]);
            }
        }
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                max=Math.max(max,arr[i]);
            }
        }
        if(max==Long.MIN_VALUE || min==Long.MAX_VALUE)
        {
            return 0;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                start=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<max){
                end=i;
                break;
            }
        }
        return end-start+1;
    }
    private static List<Integer> frequencySorting(int[] a) {
        HashMap<Integer,Integer> seen= new HashMap<>();
        List<Integer> outputArray = new ArrayList<>();
        for (int ele:a
             ) {
            seen.put(ele,seen.getOrDefault(ele,0)+1);
            outputArray.add(ele);
        }
        SortComparator sortComparator=new SortComparator(seen);

        Collections.sort(outputArray,sortComparator);
        return outputArray;
    }
}
class SortComparator implements Comparator<Integer>
{
    private final Map<Integer,Integer> map;

    public SortComparator(Map<Integer, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(Integer o1, Integer o2) {

        int freqCompare =map.get(o2).compareTo(map.get(o1));
        int valueCompare=o1.compareTo(o2);

        if (freqCompare==0)
        {
            return valueCompare;
        }
        return freqCompare;
    }
}
class Foo {
    private int data;

    public Foo() {
    }

    Foo(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
abstract class Jai{

    public void run()
    {
        System.out.println("only implementation");
    }
}
