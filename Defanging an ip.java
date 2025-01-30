class Main
{
    public static void main(String [] args)
    {
        String s="1.1.1.1";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='.')
            {
                ans=ans+s.charAt(i);

            }
            else {
                ans=ans+"[.]";
            }

        }
        System.out.print(ans);
    }
}