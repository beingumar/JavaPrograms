
class Parent
{
	public Parent()
	{
		System.out.println("In Parent Class");
	}
	public Parent(int a, int b) {
		System.out.println("A value is "+a+"\nB Value is "+b );
	}
	public Parent(int a, double b) {
		System.out.println("A value is "+a+"\nB Value is "+b );
	}
	public int Add(int a, int b) {
		return a+b;
	}
}

class Animal{
	public Animal() {
		System.out.println("In Animal Class");
	}}
	class Cat extends Animal 
	{
		public  Cat()
		{
		System.out.println("Cat is an Animal");
		}
	}
	class Dog extends Animal 
	{
		public Dog()
		{
		System.out.println("Dog is an Animal");
		}
	}

public class MainClass {

		public static void main(String[] args) {
			// Method Overloading - Static Polymorphism
			Parent p = new Parent();
			Parent p1 = new Parent(100,200);
			Parent p2 = new Parent(10,12.5);
			
			int result = p.Add(15,20);
			System.out.println("Addition is "+result);
			
			//Method Overriding - Runtime polymorphism
//			Animal a = new Animal();
			Animal cat = new Cat();
//			Cat c = new Cat();
			Animal d = new Dog();
			
	}

}


