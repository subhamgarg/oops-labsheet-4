class MedicineStock {
    String medicineName;
    int quantity;
    double price;

    MedicineStock(String medicineName, int quantity, double price) {
        this.medicineName = medicineName;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println(
            medicineName + " | Quantity: " + quantity + " | Price: " + price
        );
    }
}

class Inventory {

    MedicineStock[] stock;

    Inventory() {
        stock = new MedicineStock[3];

        stock[0] = new MedicineStock("Paracetamol", 50, 20);
        stock[1] = new MedicineStock("Crocin", 30, 25);
        stock[2] = new MedicineStock("Amoxicillin", 20, 80);
    }

    void displayInventory() {

        System.out.println("Pharmacy Inventory:");

        for (int i = 0; i < stock.length; i++) {
            stock[i].display();
        }
    }
}

public class Q4 {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.displayInventory();
    }
}