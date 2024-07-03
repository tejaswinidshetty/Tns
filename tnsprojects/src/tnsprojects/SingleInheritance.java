package tnsprojects;
class Animal{
	void eat() {
		
	}
}
class Dog extends Animal{
	void bark() {
		
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.eat();
		
		Dog d=new Dog();
		d.eat();
		d.bark();
		
		Animal a1=new Dog();
		a1.eat();
	}

	}
