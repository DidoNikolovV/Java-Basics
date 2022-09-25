import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int maxNumber = -2147483648;
        int minNumber = 2147483647;

        for(int i=0; i<n; i++) {
            int number = scanner.nextInt();

            if(number > maxNumber) {
                maxNumber = number;
            }

            if(number < minNumber) {
                minNumber = number;
            }
        }

        System.out.printf("Max number: %d\n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
