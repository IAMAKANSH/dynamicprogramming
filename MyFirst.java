import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Checking extends Exception{

}
public class MyFirst {
    public static void main(String[] args) throws Checking {

        Integer one=2;
        Integer two=2;

        if(one.equals(two))
            System.out.println("Ohh yeah");
        if (one==two)
            System.out.println("yeah");
        List<Integer> list=new ArrayList<>(1);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println(list.get(list.size()));
        Set set=new LinkedHashSet();
        set.add(2);
        set.add(1);
        System.out.println(set);
        MyFirst obj = new MyFirst(n);
        if(-1>>>31>0)
        {
           throw new Checking();
        }
        else
        {
            System.out.println("no");
        }
    }
    static int a = 10;
    static int n;
    int b = 5;
    int c;
    public MyFirst(int m) {
        System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);
    }
    // Instance Block
    {
        b = 30;
        n = 20;
    }
    // Static Block
    static
    {
        a = 60;
    }
}