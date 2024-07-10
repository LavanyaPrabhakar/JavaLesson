//Program to use random number as while loop condition
import java.util.Random;
class RandWhile
{
    public static void main(String args[])
    {
        Random rand = new Random();
        int newnum = 0;
        while(newnum!=5)
        {
            newnum = rand.nextInt(10);
            System.out.println(newnum);
        }
    }
}