//Send two parameters using object to method sum() and return its added value.
class MethodParameter
{
    int sum(int a, int b)
    {
        
        return a+b;
    }
    public static void main(String[] args)
    {
        MethodParameter obj = new MethodParameter();
        int total = obj.sum(10,20);
        System.out.println(total);
    }
}
