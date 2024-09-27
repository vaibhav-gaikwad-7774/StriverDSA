package Polimorphism;

class A{
	public void show() {
		System.out.println("in show A");
	}
}

class B extends A{
	public void show() {
		System.out.println("in show B");
	}
}
class C extends A{
	public void show() {
		System.out.println("in show C");
	}
}

public class Demo {
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		
		obj = new B();
		obj.show();
		
		obj = new C();
		obj.show();
	}

}
