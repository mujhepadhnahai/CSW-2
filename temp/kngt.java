import java.util.ArrayList;
import java.util.Scanner;

class InventoryItem {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public InventoryItem(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: $" + price;
    }
}

class InventoryManager {
    private ArrayList<InventoryItem> inventory;

    public InventoryManager() {
        inventory = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        inventory.add(item);
        System.out.println("Item added: " + item);
    }

    public void removeItem(int id) {
        for (InventoryItem item : inventory) {
            if (item.getId() == id) {
                inventory.remove(item);
                System.out.println("Item removed: " + item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void updateItem(int id, int quantity, double price) {
        for (InventoryItem item : inventory) {
            if (item.getId() == id) {
                item.setQuantity(quantity);
                item.setPrice(price);
                System.out.println("Item updated: " + item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void listItems() {
        System.out.println("Current Inventory:");
        for (InventoryItem item : inventory) {
            System.out.println(item);
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item");
            System.out.println("4. List Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    manager.addItem(new InventoryItem(id, name, quantity, price));
                    break;
                case 2:
                    System.out.print("Enter ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeItem(removeId);
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new Quantity: ");
                    int newQuantity = scanner.nextInt();
                    System.out.print("Enter new Price: ");
                    double newPrice = scanner.nextDouble();
                    manager.updateItem(updateId, newQuantity, newPrice);
                    break;
                case 4:
                    manager.listItems();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
