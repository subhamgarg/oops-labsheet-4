class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

class C extends A {
    void showC() {
        System.out.println("Class C");
    }
}

public class Q13 {
    public static void main(String[] args) {

        B b = new B();
        C c = new C();

        b.showA();
        b.showB();

        c.showA();
        c.showC();
    }
}