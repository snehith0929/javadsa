class Main {
    public static void main(String[] args)
    {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int x=0;
        for(int i=0; i<stones.length();i++) {
            char ch = stones.charAt(i);
            for (int j = 0; j < jewels.length(); j++) {
                if (ch == jewels.charAt(j)) {
                    x = x + 1;


                }
            }
        }
        System.out.print(x);
    }
}