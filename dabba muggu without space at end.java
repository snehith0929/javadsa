class Main
{
    public static void main(String [] args)
    {
        int c=0;
        for(int i=0; i<5; i++)
        {
            c=0;
        for(int j=0;j<5;j++)
        {
            
            if(c==0)
            {
            System.out.print("*");
            c++;
            }
            
            else
            {
                System.out.print("_*");
            }
        }
        
        System.out.println();
        }
    }
}