
import java.util.*;

public class CardCollection {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> cards = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of cards: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Card Symbol (e.g. Hearts): ");
            String symbol = sc.nextLine();
            System.out.print("Enter Card Value (e.g. Ace): ");
            String value = sc.nextLine();

            cards.computeIfAbsent(symbol, k -> new ArrayList<>()).add(value);
        }

        System.out.print("Enter symbol to search: ");
        String search = sc.nextLine();

        if (cards.containsKey(search)) {
            System.out.println("Cards of " + search + ": " + cards.get(search));
        } else {
            System.out.println("No cards found for symbol: " + search);
        }
    }
}
