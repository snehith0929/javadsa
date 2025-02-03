class Main
{
    public static void main(String [] args)
    {
        int r=6;
        int c=5;
        for(int i=0; i<6; i++)
        {
            for(int j=0; j<c-i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j=0; j<c; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}