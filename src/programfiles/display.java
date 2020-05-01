//method overriding//

package programfiles;

class Humanbeing 
{
	void chatrelpy()
	{
		System.out.println("hiiii");
	}
}
 class male extends Humanbeing
 {
	 void chatreply()
	 {
		 System.out.println("Yes I'm single");
	 }
 }
 class female extends Humanbeing
 {
	 void chatreply()
	 {
		 System.out.println("Sorry...I'm single");
	 }
 }
 
public class display {
	public static void main(String[] args)
	{
		male m1=new male();
		m1.chatrelpy();
		
		Humanbeing h1=m1;
		h1.chatrelpy();
		
		female f1=new female();
		f1.chatrelpy();
		
		Humanbeing h2=f1;
		h2.chatrelpy();}
	
	
	}
	
	