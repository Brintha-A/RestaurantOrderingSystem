public class Order {

    String customerName;
    String foodName;
    int quantity;

    public Order(String customerName,
                 String foodName,
                 int quantity) {

        this.customerName = customerName;
        this.foodName = foodName;
        this.quantity = quantity;
    }

    public void displayOrder() {

        System.out.println("\nOrder Details");
        System.out.println("Customer: " + customerName);
        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
    }
}