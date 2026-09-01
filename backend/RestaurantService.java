
public class RestaurantService {

    public void calculateBill(
            double price, int quantity) {

        double total = price * quantity;

        System.out.println("\nBill Details");
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + total);

        if (total >= 500) {
            System.out.println("Discount: 10%");
            total = total - (total * 0.10);
        }

        System.out.println("Final Bill: Rs." + total);
        System.out.println("Order placed successfully!");
    }
}
    

