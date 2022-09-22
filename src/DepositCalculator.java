import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double yearlyInterestPercent = Double.parseDouble(scanner.nextLine()) / 100;

        double sum = deposit  + term * ((deposit * yearlyInterestPercent ) / 12);

        System.out.println(sum);
    }
}
