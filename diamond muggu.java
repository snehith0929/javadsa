class Main
{
    public static void main(String [] args)
    {
        int r=6;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<r-i-1; j++)
            {
                System.out.print(" ");
            }
            
            for(int j=0; j<(2*i)+1; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
            r=r-1;
            for(int k=0; k<r; k++)
            {
                for(int k1=r; k1<r+k+1; k1++)
                {
                    System.out.print(" ");
                }
                
                for(int k2=r*2; k2>(2*k)+1; k2--)
                {
                    System.out.print("*");
                }
                
                System.out.println();
            }

    }
}
//2nd solution
class Main
{
    public static void main(String [] args)
    {

        int n=5;
        int c=n;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }


            for(int j=0; j<((2*c)-1); j++)
            {
                System.out.print("*");
            }
            c--;
            System.out.println();
        }

    }
}