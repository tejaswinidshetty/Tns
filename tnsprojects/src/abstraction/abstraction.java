package abstraction;

	abstract class Animal {
	    private String name;

	    public Animal(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public abstract void sound();
	}

	interface Domesticated {
	    void showAffection();
	}

	class Dog extends Animal implements Domesticated {
	    public Dog(String name) {
	        super(name); 
	    }

	    public void sound() {
	        System.out.println(getName() + " says: Woof!");
	    }

	    public void showAffection() {
	        System.out.println(getName() + " wags its tail.");
	    }
	}

	class Cat extends Animal implements Domesticated {
	    public Cat(String name) {
	        super(name); 
	    }

	    
	    public void sound() {
	        System.out.println(getName() + " says: Meow!");
	    }

	    
	    public void showAffection() {
	        System.out.println(getName() + " purrs.");
	    }
	}

	public class abstraction {
	    public static void main(String[] args) {
	        
	        Animal dog = new Dog("Buddy");
	        Animal cat = new Cat("Whiskers");

	       
	        makeSound(dog); 
	        makeSound(cat); 
	    }

	    
	    public static void makeSound(Animal animal) {
	        animal.sound(); 
	    }
	}

