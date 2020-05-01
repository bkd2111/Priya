//method overriding//

package programfiles;
 
class k1
{
	void test()
	{
		System.out.println("test() k1 class");
	}
}
 class k2 extends k1
 {
	 void test()
	 {
		 System.out.println("test() k2 class");
	 }
 }
  class k3 extends k2
  {
	  void test()
	  {
		  System.out.println("test() k2 class");
	  }
  }
  
public class overriding

{
	public static void main(String[] args)

	{
		k1 obj1=new k1();
		obj1.test();
		
		k2 obj2=new k2();
		obj2.test();
		
		k1 obj3=obj2;
		obj3.test();
		
		k3 obj4=new k3();
		obj4.test();
		
		k2 obj5=obj4;
		obj3.test();
		
		k1 obj6=obj4;
		obj6.test();
	}
	
	
	

	
	
	
	
	}
