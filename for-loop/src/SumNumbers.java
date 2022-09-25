import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

       for(int i=0; i<n; i++) {
           int number = scanner.nextInt();
           result += number;
       }

        System.out.println(result);
    }
}
