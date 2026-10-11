class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Pharmacist extends Employee {

    String qualification;

    Pharmacist(String name, int id, String qualification) {
        super(name, id);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

public class Q9 {
    public static void main(String[] args) {

        Pharmacist p =
                new Pharmacist("Rahul", 101, "B.Pharm");

        p.displayPharmacist();
    }
}