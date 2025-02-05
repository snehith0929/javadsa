class Main 
{
    public static void main(String [] args)
    {
        int n=5;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)+1; j++)
            {
                if(j==0 || j==2*i)
                {
                System.out.print("*");
                }
                
                else
                {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
            
        for(int k=n; k>0; k--)
        {
            for(int j=0; j<n-k; j++)
            {
                System.out.print(" ");
            }
            
            for(int j1=0; j1<(2*k)-1; j1++)
            {
                if(j1==0 || j1==(2*k)-2)
                {
                System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        
        
    }
}