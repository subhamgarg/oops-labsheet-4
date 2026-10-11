class MedicineProduct {

    private String name;
    private double price;
    private int quantity;

    MedicineProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class Q6 {
    public static void main(String[] args) {

        MedicineProduct medicine =
                new MedicineProduct("Paracetamol", 50, 10);

        medicine.display();
    }
}