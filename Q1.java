class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Q1 {
    public static void main(String[] args) {

        Student s = new Student("Reenu", 101);

        s.display();
    }
}