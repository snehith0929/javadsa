import java.util.*;
class Solution {
    public int scoreOfString(String s)
    {
        int c=0;
    for(int i=0;i<s.length()-1;i++)
    {
        
        int a=s.charAt(i);
        int b=s.charAt(i+1);
        c=c+Math.abs(a-b);

    }
    return c;
       
}
public static void main(String[]args)
{
    Solution x=new Solution();
    
    System.out.print(x.scoreOfString("hello"));
}
}