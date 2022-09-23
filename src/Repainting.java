import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double naylonPricePerKm = 1.50;
        double paintPricePerLiter = 14.50;
        double thinnerPricePerLiter = 5.00;

        int neededNaylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int neededThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double naylonPrice = naylonPricePerKm  * (2 + neededNaylon);
        double paintPrice = (neededPaint + (neededPaint * 0.1)) * paintPricePerLiter;
        double thinnerPrice = thinnerPricePerLiter * neededThinner;


        double totalprice = naylonPrice + paintPrice + thinnerPrice + 0.40;
        double mastersHoursPrice = totalprice * 0.3 * hours;
        double result = totalprice + mastersHoursPrice;
        System.out.println(result);
    }
}
