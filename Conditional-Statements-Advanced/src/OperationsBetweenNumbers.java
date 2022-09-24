import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        var operator = scanner.nextLine();
        String evenOrOdd = "";


        if(operator.equals("/") || operator.equals("%")) {
            double result = 0;
            if(operator.equals("/")) {
                if(n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);

                } else {
                    result =  (double)n1 / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                }

            } else{
                if(n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result =  n1 % n2;
                    System.out.printf("%d %s %d = %d", n1, operator, n2, (int) result);
                }
            }
        } else {
            int result = 0;
            if(operator.equals("+")) {
                result = n1 + n2;
                if(result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d + %d = %d - %s", n1, n2, result, evenOrOdd);
            } else if(operator.equals("-")) {
                result = n1 - n2;
                if(result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d - %d = %d - %s", n1, n2, result, evenOrOdd);
            } else if(operator.equals("*")) {
                result = n1 * n2;
                if(result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d * %d = %d - %s", n1, n2, result, evenOrOdd);
        }
        }
    }
}
