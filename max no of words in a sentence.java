import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        String arr[]={"i love deekshitha","but she rejected me"};
        int x=0;
        for(int i=0; i<arr.length; i++)
        {
        String words [] =arr[i].split(" ");
        
        
            x=Math.max(x,words.length);
        
        
        }
        
        System.out.print(x);
        
        
        
    }
}

import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        String arr[]={"i love deekshitha","but she rejected me"};
        
        int ans=0;
        for(int i=0; i<arr.length; i++)
        {
            int x=1;
            for(int j=0;j<arr[i].length();j++)
            {
                if(arr[i].charAt(j)==' ')
                {
                    x=x+1;
                }
            }
        
        ans=Math.max(ans,x);
        }
        System.out.print(ans);
        
        
    }
}