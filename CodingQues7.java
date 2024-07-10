// Get an input for colour of the traffic light. 
// if colour="red" print "Stop"
// if colour="yellow" print "Get ready"
// if colour="green" print "Go"


import java.util.Scanner;
class CodingQues7
{
public static void main(String args[])
{

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the colour(red/yellow/green) :");
    String colour = input.nextLine();
   
    
    if (colour.equals("red"))
    {
        System.out.println("Stop");
    }
    else if (colour.equals("yellow"))
    {
       System.out.println("Get Ready"); 
    }
    else if (colour.equals("green"))
    {
       System.out.println("Go"); 
    }
}
}