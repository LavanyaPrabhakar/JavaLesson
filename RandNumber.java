//Print a random number with range upto 10
import java.util.Random;
class RandNumber
{
    public static void main(String agrs[])
    {

Random rand = new Random();
int newnum = rand.nextInt(10);
System.out.println(newnum);
    }
}