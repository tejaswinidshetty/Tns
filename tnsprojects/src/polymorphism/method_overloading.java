package polymorphism;
class Adder{
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
	

public class method_overloading {
	public static void main(String[] args) {
		Adder a=new Adder();
	}

}
