//Create a method getname() to return your name.
//Create a method getphone() to return your phone number.
class MethodParameter1
{
    String getname(String name)
    {
        return name;
    }
    String getphone(String phone)
    {
        return phone;
    }
    public static void main(String[] args)
    {
        MethodParameter1 obj = new MethodParameter1();
        String myname = obj.getname("John");
        String myphone = obj.getphone("012345678");
        System.out.println(myname);
        System.out.println(myphone);
    }
}