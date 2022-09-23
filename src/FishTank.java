import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double area = length * width * height;
        double areaInLiters = area / 1000;
        double areaTaken = percent / 100;
        double neededLiters = areaInLiters * (1 - areaTaken);

        System.out.println(neededLiters);
    }
}
