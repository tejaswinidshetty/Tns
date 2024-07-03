package tnsprojects;
class Animal{
	void eat() {
		
	}
}
class Dog extends Animal{
	void bark() {
		
	}
}
class Puppy extends Dog{
	void weep() {
		
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.eat();
		
		Dog d =new Dog();
		d.eat();
		d.bark();
		
		Puppy p=new Puppy();
		p.eat();
		p.bark();
		p.weep();
		
		Animal a1=new Dog();
		Animal a2= new Puppy();
		Dog d1 =new Puppy();
	}

}
