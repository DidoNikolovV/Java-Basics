import java.util.Scanner;

public class ExcellenResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = scanner.nextDouble();
        if(result >= 5) {
            System.out.println("Excellent!");
        }
    }
}
