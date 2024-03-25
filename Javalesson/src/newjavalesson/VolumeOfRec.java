package newjavalesson;
class Rectangle
{
	int length, breadth,volume;
	Rectangle(int x, int y)
	{
		length=x;
		breadth=y;
		volume=x*y;
	}
	void comparevol(Rectangle rec2)
	{
	if(rec2.volume > this.volume)
	{
		System.out.println("r2 is bigger than r1");
	}
	else
	{
		System.out.println("r1 is bigger than r2");
	}
	}
}
public class VolumeOfRec {

	public static void main(String[] args) {
		Rectangle r1= new Rectangle(10,5);
		Rectangle r2= new Rectangle(20,3);
		r1.comparevol(r2);
	}

}
