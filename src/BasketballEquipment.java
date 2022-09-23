import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTax = Integer.parseInt(scanner.nextLine());

        double basketballShoes = yearlyTax * 0.6;
        double basketballEquipment = basketballShoes * 0.8;
        double basketballBall = basketballEquipment * 0.25;
        double basketballAccessories = basketballBall * 0.20;

        double totalPrice = yearlyTax  + basketballEquipment + basketballBall + basketballAccessories + basketballShoes;
        System.out.println(totalPrice);
    }
}
