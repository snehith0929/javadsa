import java.util.*;
class Main
{
    public static void main(String [] args)
    {
       int arr[] ={17,18,5,4,6,1};
       int rightmax=-1;
       for(int i=arr.length-1; i>=0; i--)
       {
           
           int ori=arr[i];
           arr[i]=rightmax;
           rightmax=Math.max(ori,rightmax);
       }
       System.out.print(Arrays.toString(arr));
}
}