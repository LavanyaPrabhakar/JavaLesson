//Print *three times in a row and repeat the same in 4 lines using nested for loop
//*** in 4 lines
class NestedFor2
{
    public static void main(String args[])
        {
          for (int line=1;line<=4;line++)
            {
                for (int i=1;i<=3;i++)
                {
                    System.out.print("*");// print is used to display * in the same line
                }
                System.out.println();//println is used to move to next line
            }
        } 

}
