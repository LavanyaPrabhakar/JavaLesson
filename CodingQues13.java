//Get input for 5 numbers using Array and For loop
import java.util.*;

class CodingQues13
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        
        for(int i=0;i<=4;i++)
        {
            System.out.println("Enter num["+i+"] ");
            num[i]=scan.nextInt();
            System.out.println("array value "+num[i]);
        }
        System.out.println("array value");
        for(int j=0;j<=4;j++)
        {
            
            
            System.out.println("num["+j+"] is "+num[j]);
        }





    }
}