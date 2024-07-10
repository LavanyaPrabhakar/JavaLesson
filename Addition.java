//Create a class - Addition with variables a=10,b=20 and method sum() to add a and b and to print the total.
//Note: Call method sum() from the main method
class Addition
{
    int a=10, b=20;
    void sum()
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        Addition obj = new Addition();
        obj.sum();

    }
}