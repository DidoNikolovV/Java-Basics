import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0; i < n*2; i++) {
            int number = scanner.nextInt();
            if(i <= n/2) {
                leftSum += number;
            } else {
                rightSum += number;
            }
        }

        if(leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("Nom, diff = %d", Math.abs((leftSum - rightSum)));
        }
    }
}
