public class RestaurantApplication {

    public static void main(String[] args) {

        System.out.println("RESTAURANT ORDERING SYSTEM");
        System.out.println("--------------------------");

        Food food = new Food(1, "Chicken Biryani", 180);
        food.displayFood();

        User user = new User("Customer", "customer@gmail.com");
        user.displayUser();

        Order order = new Order(
            user.name, food.name, 2
        );

        order.displayOrder();

        RestaurantService service =
            new RestaurantService();

        service.calculateBill(
            food.price, order.quantity
        );
    }
}