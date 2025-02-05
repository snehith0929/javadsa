class Main 
{
    public static void main(String [] args)
    {
        
        int n=6;
        int c=n-1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
            System.out.print(" ");
            }
            
            for(int j=0; j<(2*c)+1; j++)
            {
                System.out.print("*");
            }
            c--;
            System.out.println();
        }
int c1=1;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-2; j++)
            {
                
                System.out.print(" ");
                
            }
            
            for(int j=0; j<(2*c1)+1; j++)
            {
                if(c1!=n)
                {
                System.out.print("*");
                }
            }
            c1++;
            System.out.println();
        }
        
        
    }
}