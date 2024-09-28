class A {
    public A() {
        System.out.println("in A");
    }
}

class B extends A {
    public B() {
        System.out.println("in B");
    }

    public B(int n) {
        System.out.println("in B int ");
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        B obj = new B(); // Calls the default constructor of class B
    }
}
