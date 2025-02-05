class Main
{
    public static void main (String [] args)
    {
        int c=0;
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5-i-1; j++)
            {
                System.out.print(" ");
            }
            c++;
            for(int j=0;j<c+i;j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
    }
}