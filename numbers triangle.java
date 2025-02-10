class Main
{
    public static void main(String [] args)
    {
        int n=5;
        int temp=n;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<2*(n-i-1); j++)
            {
                System.out.print(" ");
            }
        
            for(int j=i+1; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            
            for(int j=2; j<=i+1; j++)
            {
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    }
}