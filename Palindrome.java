import java.util.*;
class Palindrome {
    public static void main(String[] args)
    {
        String s="aba";
        String temp=s;
        String rev="";
        for(int i=s.length()-1; i>=0; i--)
        {
            rev=rev+s.charAt(i);
        }
        s=temp;
        if(s.equals(rev))
        {
            System.out.print("palindrome");
        }
        else {
            System.out.print("no");
        }

    }
}