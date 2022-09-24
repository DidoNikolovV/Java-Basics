import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int videoCardPrice = 250;

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardAmount = Integer.parseInt(scanner.nextLine());
        int processorAmount = Integer.parseInt(scanner.nextLine());
        int ramAmount = Integer.parseInt(scanner.nextLine());

        double totalVideoCardPrice = videoCardPrice * videoCardAmount;
        double processorPrice = totalVideoCardPrice * 0.35 * processorAmount;
        double ramPrice = totalVideoCardPrice * 0.1 * ramAmount;


        double total = totalVideoCardPrice + processorPrice + ramPrice;

        if(videoCardAmount > processorAmount) {
            total *= 0.85;
        }

        if(total > budget) {
            System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
        } else {
            System.out.printf("You have %.2f leva left!", budget - total);
        }

    }
}
