class Main
{
    public static void main(String [] args)
    {
        int r=4;
        int n=9;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 || j==n-1 || i==0 || i==r-1)
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
    }
}