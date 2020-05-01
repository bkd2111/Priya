package programfiles;

class upc
{
	int i=10;
	static int a=100;
}
class up1 extends upc
{
	int j=20;
	static int b=200;
}
 class up2 extends up1
 {
	 int k=30;
	 static int c=300;
 }
 public class upcastingmain
  {
	  public static void main (String...a)
	  {
		  up2 obj1 = new up2();
		  System.out.println("up2 class ref");
		  System.out.println(obj1.i);
		  System.out.println(obj1.j);
		  System.out.println(obj1.k);
		  System.out.println(obj1.a);
		  System.out.println(obj1.b);
		  System.out.println(obj1.c);
		  
		  up1 obj2=obj1;
		  System.out.println("up1 class ref");
		  System.out.println(obj2.i);
		  System.out.println(obj2.j);
		  System.out.println(obj2.a);
		  System.out.println(obj2.b);
		  
		  upc obj3=obj2;
		  System.out.println("Upcastingg class ref");
		  System.out.println(obj3.i);
		  System.out.println(obj3.a);
		  
		  Object obj4=obj1;
		  System.out.println("object class ref");
		  System.out.println(obj1);
		  System.out.println(obj2);
		  System.out.println(obj3);
		  System.out.println(obj4);
	  }
  
		  
		  
	  }
	
