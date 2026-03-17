import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> todos = new ArrayList<>();
        while (true) {
            System.out.println("\n1) add 2) list 3) remove 4) exit");
            System.out.print("Choose: ");
            String op = scanner.nextLine().trim();
            if (op.equals("1")) {
                System.out.print("New task: ");
                todos.add(scanner.nextLine().trim());
            } else if (op.equals("2")) {
                if (todos.isEmpty()) {
                    System.out.println("No tasks yet");
                } else {
                    for (int i=0; i<todos.size(); i++) {
                        System.out.println((i+1) + ". " + todos.get(i));
                    }
                }
            } else if (op.equals("3")) {
                System.out.print("Index to remove: ");
                try {
                    int idx = Integer.parseInt(scanner.nextLine().trim()) - 1;
                    if (idx >= 0 && idx < todos.size()) {
                        System.out.println("Removed: " + todos.remove(idx));
                    } else {
                        System.out.println("Invalid index");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Enter a number");
                }
            } else if (op.equals("4")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye!");
        scanner.close();
    }
}