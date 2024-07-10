//Print the number(Range 1 to 100) which are divisible by both 3 and 5. 
class CodingQues12
{
    public static void main(String args[])
    {
        System.out.println("The numbers divisible by both 3 & 5 between 1 and 100 are:");
        for(int i=1; i<=100; i++)
        {
            if((i%3==0) && (i%5==0))
            {
                System.out.println(i);
            }
        }
    }
}