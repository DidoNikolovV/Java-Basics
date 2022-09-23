import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesAmount = Integer.parseInt(scanner.nextLine());
        int dollsAmount = Integer.parseInt(scanner.nextLine());
        int bearsAmount = Integer.parseInt(scanner.nextLine());
        int minionsAmount = Integer.parseInt(scanner.nextLine());
        int trucksAmount = Integer.parseInt(scanner.nextLine());

        int totalToys = puzzlesAmount + dollsAmount + bearsAmount + minionsAmount +trucksAmount;

        double totalPuzzlePrice = puzzlePrice * puzzlesAmount;
        double totalDollsPrice = dollPrice * dollsAmount;
        double totalBearsPrice = bearPrice * bearsAmount;
        double totalMinionsPrice = minionPrice * minionsAmount;
        double totalTrucksPrice = truckPrice * trucksAmount;

        double totalPrice = totalPuzzlePrice + totalDollsPrice + totalBearsPrice + totalMinionsPrice + totalTrucksPrice;

        if(totalToys >= 50) {
            totalPrice *= 0.75;
        }

        double loan = totalPrice * 0.1;
        double profit = totalPrice - loan;
        if(profit >= excursionPrice) {
            profit -= excursionPrice;
            System.out.printf("Yes! %.2f lv left.", profit);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - profit);
        }
    }
}
