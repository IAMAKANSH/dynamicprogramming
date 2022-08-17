import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static String check(String encryptedMessage)
    {
        String[] str=encryptedMessage.split(" ");
        List<String> list=new ArrayList<>();
        for(int i= str.length-1;i>=0;i--)
        {
            char[] curr=str[i].toCharArray();
            String s="";
            for (char c : curr) {

                if(c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9')
                {
                    int number=c-'0';
                    for(int j=0;j<number-1;j++)
                    {
                        s +=s.charAt(s.length()-1);
                    }
                }
                else{
                    s +=c;
                }
            }
            list.add(s.toString());
        }
        return list.stream().collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(check("seaside the to sent be to ne2ds army ten of team a"));
    }
}
