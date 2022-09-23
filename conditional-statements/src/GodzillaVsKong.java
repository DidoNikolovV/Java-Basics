import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statistAmount = Integer.parseInt(scanner.nextLine());
        double equipmentPricePerStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = movieBudget * 0.10;
        double totalEquipmentPrice = equipmentPricePerStatist * statistAmount;
        if(statistAmount > 150) {
            totalEquipmentPrice *= 0.9;
        }

        double totalPrice = decorPrice + totalEquipmentPrice;

        if(totalPrice > movieBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - movieBudget);
        }else if(totalPrice <= movieBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", movieBudget - totalPrice);
        }
    }
}
