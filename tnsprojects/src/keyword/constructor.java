package keyword;
class Animal{
	Animal(){
		System.out.println("Animal constructor");
	}
	
}
class Dog extends Animal{
	Dog(){
		System.out.println("Dog constructor");
	}
	
}

public class constructor {

	public static void main(String[] args) {
		Dog d =new Dog();

	}

}
