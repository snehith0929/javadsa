import java.util.*;
class Main
{
    public static int[] fun()
    {
        int arr[]= {1,2,3,4};
        return arr;
    }

    public static String fam(String s)
    {
        return s+" hello";
    }
    public static void main(String [] args)
    {
        int s[]=fun();
        for(int i=0; i<s.length;i++)
        {
            System.out.println(s[i]);
        }

        String h=fam("Snehith");
        System.out.print(h);



    }
}