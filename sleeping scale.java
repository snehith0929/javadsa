class Main
{
    public static void main(String [] args)
    {
        int c=0;
        int n=9;
        for(int i=0; i<3; i++)
        {
            
        for(int j=0;j<n;j++)
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