//Create a class Store with two methods method getSoap() and method getChocolate()
//pass 20 pounds as parameter to buy soap and 15 pound to buy chocolate and 
//print soap and chocolate values in their respective methods. 
class Store
{

    void getSoap(int soapmoney)
    {
        System.out.println(soapmoney);
        System.out.println("Soap purchased");
    }

        void getChocolate(int chocomoney)
    {
        System.out.println(chocomoney);
        System.out.println("Chocolate purchased");
    }


    public static void main(String[] args)
    {
        Store obj = new Store();
        obj.getSoap(20);
        obj.getChocolate(15);
    }

}