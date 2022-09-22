import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double packagePencilPrice = 5.80;
        double packageMarkerPrice = 7.20;
        double detergentPricePerLiter = 1.20;

        int pencilPackages = Integer.parseInt(scanner.nextLine());
        int markerPackages = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        double percentDiscount = Integer.parseInt(scanner.nextLine());

        double totalPencilPrice = packagePencilPrice * pencilPackages;
        double totalMarkerPrice = packageMarkerPrice * markerPackages;
        double totalDetergentPrice = detergentPricePerLiter * detergentLiters;
        double discount = percentDiscount / 100;
        double totalPrice = totalPencilPrice + totalMarkerPrice + totalDetergentPrice;
        double discountedPrice = totalPrice - (totalPrice * discount);
        System.out.println(discountedPrice);


    }
}
