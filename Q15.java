class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {

    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Doctor extends Employee {

    String specialization;

    Doctor(String name, int employeeId, String specialization) {
        super(name, employeeId);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {

    String qualification;

    Pharmacist(String name, int employeeId, String qualification) {
        super(name, employeeId);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

class HospitalSystem {

    private Doctor doctor;
    private Pharmacist pharmacist;

    HospitalSystem() {

        doctor = new Doctor(
                "Dr. Amit",
                101,
                "Cardiology"
        );

        pharmacist = new Pharmacist(
                "Rahul",
                102,
                "B.Pharm"
        );
    }

    void displaySystem() {

        System.out.println("===== HOSPITAL STAFF =====");

        System.out.println("\nDoctor Details:");
        doctor.displayDoctor();

        System.out.println("\nPharmacist Details:");
        pharmacist.displayPharmacist();
    }
}

public class Q15 {
    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();

        system.displaySystem();
    }
}