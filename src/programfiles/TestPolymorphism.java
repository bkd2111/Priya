package programfiles;


public class TestPolymorphism
{  
void eat()
{
	System.out.println("eating");
	}  
}  
class Dog extends TestPolymorphism
{  
void eat()
{
	System.out.println("eating fruits");
	}  
}  
class BabyDog extends Dog
{  
void eat()
{
	System.out.println("drinking milk");
	} 
public static void main(String[] args)
{  
TestPolymorphism a1,a2,a3;  
a1=new TestPolymorphism();  
a2=new Dog();  
a3=new BabyDog();  
a1.eat();  
a2.eat();  
a3.eat();  
}  
}  


