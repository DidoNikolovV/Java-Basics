import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermansCount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        boolean discount = true;

        if(season.equals("Spring")) {
            price = 3000;
        } else if(season.equals("Summer")) {
            price = 4200;
        } else if(season.equals("Autumn")) {
            discount = false;
            price = 4200;
        } else if(season.equals("Winter")) {
            price = 2600;
        }

        if(fishermansCount <= 6) {
            price *= 0.9;
        } else if(fishermansCount >=7 && fishermansCount <=11) {
            price *= 0.85;
        } else if(fishermansCount >= 12) {
            price *= 0.75;
        }

        if((fishermansCount % 2 == 0) && discount) {
            price *= 0.05;
        }

        if(budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
