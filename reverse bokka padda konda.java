class Main 
{
    public static void main(String [] args)
    {
        int n=5;
        int c=n;
        for(int i=n; i>0; i--)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            
            for(int j=0; j<(2*i)-1; j++)
            {
                if(i==5 || j==0 || j==(2*i)-2)
                System.out.print("*");
                
                else
                System.out.print(" ");
            }
            
            System.out.println();
            
            
        }
        
    }
}