class PatientBill {

    private double consultationFee;
    private double medicineFee;
    private double testFee;

    void setConsultationFee(double fee) {
        consultationFee = fee;
    }

    void setMedicineFee(double fee) {
        medicineFee = fee;
    }

    void setTestFee(double fee) {
        testFee = fee;
    }

    double calculateTotal() {
        return consultationFee + medicineFee + testFee;
    }

    void displayBill() {
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Fee: " + medicineFee);
        System.out.println("Test Fee: " + testFee);
        System.out.println("Total Bill: " + calculateTotal());
    }
}

public class Q8 {
    public static void main(String[] args) {

        PatientBill bill = new PatientBill();

        bill.setConsultationFee(500);
        bill.setMedicineFee(800);
        bill.setTestFee(700);

        bill.displayBill();
    }
}