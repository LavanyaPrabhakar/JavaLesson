// Get an input for 5 subjects.  \find average.
// if averager<=34 print "Additional class is needed" else print"You are good to go".

// if score>=71 print "Excellent performance!"
import java.util.Scanner;
class CodingQues6
{
public static void main(String args[])
{

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the mark1 :");
    int mark1 = input.nextInt();
    System.out.println("Enter the mark2 :");
    int mark2 = input.nextInt();
    System.out.println("Enter the mark3 :");
    int mark3 = input.nextInt();
    System.out.println("Enter the mark4 :");
    int mark4 = input.nextInt();
    System.out.println("Enter the mark5 :");
    int mark5 = input.nextInt();
    int avg = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
    
    if (avg <= 34)
    {
        System.out.println("Additional class is needed");
    }
    else 
    {
       System.out.println("You are good to go"); 
    }

}
}