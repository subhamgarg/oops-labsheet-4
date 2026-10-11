class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Doctor extends Employee {

    String specialization;

    Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Specialization: " + specialization);
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

public class Q10 {
    public static void main(String[] args) {

        Doctor d = new Doctor(
                "Dr. Amit",
                101,
                "Cardiology"
        );

        Pharmacist p = new Pharmacist(
                "Rahul",
                102,
                "B.Pharm"
        );

        System.out.println("Doctor Details:");
        d.displayDoctor();

        System.out.println();

        System.out.println("Pharmacist Details:");
        p.displayPharmacist();
    }
}