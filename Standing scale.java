class Main
{
    public static void main(String [] args)
    {
        int c=0;
        int n=3;
        for(int i=0; i<9; i++)
        {
            
        for(int j=0;j<3;j++)
        {
            System.out.print("*");
            if(j!=n-1)
            {
                System.out.print("_");
            }
        }
        
        System.out.println();
        }
    }
}