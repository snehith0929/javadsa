class Main
{
    public static String rev(String s)
    {
        
        String rev="";
        
        int c=s.length()-1;
        while(c>=0)
        {
           rev=rev+s.charAt(c);
           c--;
        }
        return rev;
        
    }
    
    public static void main(String [] args)
    {
        
        int x=0;
        for(int i=0; i<words.length; i++)
        {
            String d=words[i];
            for(int j=i+1; j<words.length;j++)
            {
                if(d.equals(rev(words[j])))
                {
                    x=x+1;
                }
            }
                
            
        
        }
        return x;
        
    }
}
