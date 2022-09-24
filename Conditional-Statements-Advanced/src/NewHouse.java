import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int flowersAmount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if(flowersType.equals("Roses")) {
            price = 5 * flowersAmount;
            if(flowersAmount > 80) {
                price *= 0.9;
            }
        } else if(flowersType.equals("Tulips")) {
            price = 2.80 * flowersAmount;
            if(flowersAmount > 80) {
                price *= 0.85;
            }
        } else if(flowersType.equals("Narcissus")) {
            price = 3 * flowersAmount;
            if(flowersAmount < 120) {
                price *= 1.15;
            }

        } else if(flowersType.equals("Dahlias")) {
            price = 3.80 * flowersAmount;
            if(flowersAmount > 90) {
                price *= 0.85;
            }
        } else if(flowersType.equals("Gladiolus")) {
            price = 2.50 * flowersAmount;
            if(flowersAmount < 80) {
                price *= 1.20;
            }
        }

        if(budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersAmount, flowersType, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
