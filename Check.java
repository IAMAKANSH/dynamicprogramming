import java.util.*;

public class Check {

    public static void main(String[] args) {
//        int N=4;
//        int M=4;
//        int mat[][]={{10,20,30,40},
//                {15,25,35,45},
//                {27,29,37,48},
//                {32,33,39,50}};
//        int X=37;
//        int res=result(mat,N,M,X);
//        System.out.println(res);
        int A[] = {9,9,9,2,5};
        HashMap<Integer,Pair> seen=new HashMap<>();
        for (int i=0;i<A.length;i++)
        {
            Pair p=seen.getOrDefault(A[i],new Pair(A[i],0));
            p.frequency=p.frequency+1;
            seen.put(A[i],p);
        }
        PriorityQueue<Pair> queue=new PriorityQueue<>(seen.values());
        System.out.println(Arrays.toString(queue.toArray()));
        node n1=new node(5000,"Aaknsh");
        node n2=new node(3000,"Ramesh");
        node n3=new node(5000,"Jamesh");
        node arr[]=new node[3];
        arr[0]=n1;
        arr[1]=n2;
        arr[2]=n3;
        sortRecords(arr,3);
        System.out.println(Arrays.toString(arr));

    }
    static void sortRecords(node arr[],int n)
    {
        Comparator<node> nodeComparator=(o1, o2) -> {
            if (o1.salary==o2.salary)
                return o1.name.compareTo(o2.name);
            return o1.salary-o2.salary;
        };
        Arrays.sort(arr,nodeComparator);
        List<Integer> ll=new LinkedList<>();
    }
    static class Pair implements Comparable<Pair> {

        int value;
        int frequency;

        public Pair(int value, int frequency) {
            this.value = value;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.frequency==o.frequency)
            {
                return this.value-o.value;
            }
            else {
                return o.frequency - this.frequency;
            }
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "value=" + value +
                    ", frequency=" + frequency +
                    '}';
        }
    }
    public static int result(int mat[][], int N, int M, int X)
    {
        int start=0;
        int end=N-1;
        while(start<=end)
        {

            int rowMid=(int)Math.floor((start+end)/2);
            if(X>=mat[rowMid][0] && X<=mat[rowMid][M-1])
            {
                int start1=0;
                int end1=M-1;
                while(start1<=end1)
                {

                    int mid=(int)Math.floor((start1+end1)/2);
                    if(mat[rowMid][mid]==X)
                    {
                        return 1;
                    }
                    else if(X<mat[rowMid][mid])
                    {
                        end1=mid-1;
                    }
                    else{
                        start1=mid+1;
                    }

                }
            }
            if(X<mat[rowMid][0])
            {
                end=rowMid-1;
            }
            else
            {
                start=rowMid+1;
            }

        }

        return 0;
    }
}
class node
{
    int salary;
    String name;

    public node(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public void setSalary(int a)
    {
        this.salary=a;
    }
    public void setName(String s)
    {
        this.name=s;
    }

    @Override
    public String toString() {
        return "node{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

