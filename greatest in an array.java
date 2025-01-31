class Main
{
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,50,6,7,8,9,10,60};
        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>a)
            {
                a=arr[i];
            }
        }
        System.out.print(a);
    }
}