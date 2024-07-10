class EnhancedForLoop1
{
    public static void main(String[] args)
    {
        int num[] = {12,45,67,90,34};

     /*   for(int i=0;i<=4;i++)
        {
            System.out.println(num[i]);
        } */

        for(int var:num)
        {
             System.out.println(var);
        }
    }
}