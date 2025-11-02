package Challange;// GroceryList.java
import java.util.*;

public class Main {
    private static final ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("Choice: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "0" -> {
                    System.out.println("Bye!");
                    return;
                }
                case "1" -> {
                    System.out.print("Enter item(s) to add (comma-separated): ");
                    addItems(sc.nextLine());
                    printSorted();
                }
                case "2" -> {
                    System.out.print("Enter item(s) to remove (comma-separated): ");
                    removeItems(sc.nextLine());
                    printSorted();
                }
                default -> System.out.println("Invalid choice.\n");
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
            === Grocery List ===
            0 - Exit
            1 - Add item(s)
            2 - Remove item(s)
            """);
    }

    private static String norm(String s) { return s.trim().toLowerCase(); }

    private static void addItems(String line) {
        for (String raw : line.split(",")) {
            String it = norm(raw);
            if (!it.isEmpty() && !items.contains(it)) items.add(it);
        }
    }

    private static void removeItems(String line) {
        for (String raw : line.split(",")) {
            String it = norm(raw);
            if (!it.isEmpty()) items.remove(it);
        }
    }

    private static void printSorted() {
        ArrayList<String> copy = new ArrayList<>(items);
        Collections.sort(copy);
        System.out.println("Current list (sorted): " + copy + "\n");
    }
}
