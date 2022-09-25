import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        int money = 0;

        for(int i=1; i<=age; i++) {
            if(i % 2 == 0) {
                if(i == 2) {
                    money += 10;
                } else {
                    money += 10 * (i / 2);
                }
                money--;
            } else {
                toys++;
            }
        }

        int toysPrice = toys * pricePerToy;
        money += toysPrice;

        if(money >= washingMachinePrice) {
            System.out.printf("Yes! %.2f",  money - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - money);
        }
    }
}
