package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.setUsername("Raju");
        db1.setUsername("Sameer");
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("instance 1 username : " + db1.getUsername());
        System.out.println("instance 2 username : " + db2.getUsername());
    }
}
