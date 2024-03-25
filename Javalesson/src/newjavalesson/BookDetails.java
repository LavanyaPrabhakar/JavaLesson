package newjavalesson;
class Book
{
public
   int book_id;
   float book_price;
   String book_name;
   void setData1()
   {
	   book_id=100;
	   book_price=25.25F;
	   book_name= "Java Book"; 
   }
   Book()
   {
   System.out.println("This is my Constructor");
   book_id=102;
   book_price=30.25F;
   book_name= "C++ Book"; 
   }
   void setData2()
   {
	    book_id=101;
	    book_price=30.25F;
	    book_name= "Java Book"; 
   }
   void putData()
   {
	   System.out.println("book_id = "+book_id);
	   System.out.println("book_price = "+book_price);
	   System.out.println("book_name = "+book_name);
   }
}
public class BookDetails {

	public static void main(String[] args) {
		Book b1= new Book();
		b1.putData();
		b1.setData1();
		b1.putData();
		Book b2= new Book();
		b2.putData();
		b2.setData2();
		b2.putData();
	
	}

}
