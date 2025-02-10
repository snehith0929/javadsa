class Main
{
    public static void main(String [] args)
    {
        int arr[]={1,1,1,6,1,1,1};
        int max=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]!=arr[j])
                {
                    int temp=j-i;
                    max=Math.max(max,temp);
                }
            }
        }
        System.out.print(max);
    }
}