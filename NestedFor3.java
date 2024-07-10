//Print * in line1,** in lin2 and *** in line 3 using nested for loop
//Note 
class NestedFor3
{
    public static void main(String args[])
        {
          for (int j=1;j<=3;j++)
            {
                for (int i=1;i<=j;i++) //assign i<=j as condition to print * as pyramid
                {
                    System.out.print("*");
                }
                System.out.println();//println is used to move to next line
            }
        } 

}