class Main
{
    public static void main (String [] args)
    {
        int r = 50;  
        for(int i = 0; i < r; i++)
        {
           
            for(int j = r; j < r + i; j++)
            {
                System.out.print(" ");
            }
            
            
            for(int j = r * 2; j > 2 * i + 1; j--)
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