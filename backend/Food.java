
public class Food {

    int id;
    String name;
    double price;

    public Food(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayFood() {

        System.out.println("\nFood Details");
        System.out.println("Food ID: " + id);
        System.out.println("Food Name: " + name);
        System.out.println("Price: Rs." + price);
    }
}