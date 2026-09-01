

    public class User {

    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayUser() {

        System.out.println("\nCustomer Details");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    
}
