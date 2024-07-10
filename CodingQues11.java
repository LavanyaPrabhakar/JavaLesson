//Count the number of odd numbers from 1 to 10 
//Print all the odd numbers
//print the number of odd numbers between 1 and 10

class CodingQues11
{
    
    public static void main(String args[])
    {
       int count=0;
            System.out.println("Odd numbers are:");
            for(int i=1;i<=10;i++)
            {
                
                int result=i%2;
                
                if(result!=0)
                {
                    System.out.println(i);
                count=count+1;
                
                }
                 
                
            }
            System.out.println("The number of odd numbers between 1 and 10 is:");
            System.out.println(count);
    }
       
}