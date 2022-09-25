import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<n; i++) {
            int number = scanner.nextInt();
            sum += number;

            if(number > maxNumber) {
                maxNumber = number;
            }
        }

        int sumWithoutMax = sum - maxNumber;


        if(sumWithoutMax == maxNumber) {
            System.out.printf("Yes\nSum = %d", sumWithoutMax);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(maxNumber - sumWithoutMax));
        }
    }
}
