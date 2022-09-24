import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int hallArea = rows * cols;
        double result = 0;

        if(projectionType.equals("Premiere")) {
            result = 12 * hallArea;
        } else if(projectionType.equals("Normal")) {
            result = 7.50 * hallArea;
        } else if(projectionType.equals("Discount")) {
            result = 5 * hallArea;
        }

        System.out.printf("%.2f leva", result);
    }
}
