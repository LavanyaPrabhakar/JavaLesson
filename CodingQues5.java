// Get an input for score in a game
// if score<=49 print "You need to improve"
// if score between 50 and 70(inclusive) print "Good job!"
// if score>=71 print "Excellent performance!"
import java.util.Scanner;
class CodingQues5
{
public static void main(String args[])
{

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the score :");
    int score = input.nextInt();

    
    if (score<=49)
    {
        System.out.println("You need to improve");
    }
    else if(score >= 50 && score<=70)
    {
        System.out.println("Good job!");
    }
    else if(score>=71)
        {
        System.out.println("Excellent performance!");
    }

}
}
