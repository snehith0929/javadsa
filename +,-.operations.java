class Solution {
    public static void main(String [] args)
    {
         int x=0;
        
        for(int i=0; i<=a1.length-1;i++)
        {
            if(a1[i].equals("++X") || a1[i].equals("X++"))
            {
                x=x+1;
            }
            else if(a1[i].equals("--X") || a1[i].equals("X--"))
            {
                x=x-1;
            }

        }
        return x;
    }
}