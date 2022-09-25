import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        for(int i=0; i<n; i++) {
            int number = scanner.nextInt();

            if(i % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }


        if(evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs((evenSum - oddSum)));
        }

    }
}
