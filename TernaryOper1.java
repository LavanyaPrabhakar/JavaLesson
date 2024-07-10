//Difference between the Ternary Operator and if-else statement
class TernaryOper1
{
    public static void main(String args[])
    {
        boolean rain = true;
        if(rain)
        {
            System.out.println("Umbrella");
        }
        else
        {
            System.out.println("Enjoy the Sun");
        }
        String result = rain? "Umbrella" : "Enjoy the Sun";
        System.out.println(result);
    }
}