import java.util.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();//Empty string after a will go into this and new lines will go into for loops input statement
        String arr[]=new String[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextLine();
        }
        System.out.print(Arrays.toString(arr));
        
    
        // int b=sc.nextInt();
        // for(int i=1; i<11; i++)
        // {
        //     System.out.println(b+" * "+i+" = "+b*i);
        // }
    }
}