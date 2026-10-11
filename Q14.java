class Shape {

    void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

public class Q14 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(7);

        r.display();
        r.area();

        System.out.println();

        c.display();
        c.area();
    }
}