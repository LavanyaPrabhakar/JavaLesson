//Create a class - Garden with variables apple_price=20,apple_count=5 and 
//method total_money() to mutiply apple_price and apple_count and to print the total_amount.
//Note: Call method total_money() from the main method
class Garden
{
    int apple_price=20, apple_count=5;
    void total_money()
    {
        int total_amount=apple_price*apple_count;
        System.out.println(total_amount);
    }
    public static void main(String[] args)
    {
        Garden obj = new Garden();
        obj.total_money();

    }
}