package telusko;

import others.A;
import others.B;

class C extends A{
	public void abc() {
		System.out.println(marks);
	}
}

public class Demo {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.marks);
		obj.show();
		
		
		B obj1 = new B();
		System.out.println(obj.marks);
	}

}
