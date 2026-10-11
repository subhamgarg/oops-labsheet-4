class Medicine {
    String name;
    double price;
    String manufacturer;

    Medicine(String name, double price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    void display() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

public class Q2 {
    public static void main(String[] args) {

        Medicine m = new Medicine("Paracetamol", 50.0, "ABC Pharma");

        m.display();
    }
}