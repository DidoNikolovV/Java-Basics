import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double vegetarianMenu = 8.15;

        int chickenMenuAmount = Integer.parseInt(scanner.nextLine());
        int fishMenuAmount = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuAmount = Integer.parseInt(scanner.nextLine());

        double chickenMenuTotalPrice = chickenMenu * chickenMenuAmount;
        double fishMenuTotalPrice = fishMenu * fishMenuAmount;
        double vegetarianMenuTotalPrice = vegetarianMenu * vegetarianMenuAmount;

        double totalPrice = chickenMenuTotalPrice + fishMenuTotalPrice + vegetarianMenuTotalPrice;
        double dessertPrice = totalPrice * 0.2;
        double result = totalPrice + dessertPrice + 2.50;
        System.out.println(result);
    }
}
