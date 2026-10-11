class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B {
    void showB() {
        System.out.println("Class B");
    }
}

public class Q12 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.showA();
        b.showB();
    }
}