import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerSeconds = Integer.parseInt(scanner.nextLine());
        int secondPlayerSeconds = Integer.parseInt(scanner.nextLine());
        int thirdPlayerSeconds = Integer.parseInt(scanner.nextLine());

        int totalTime = firstPlayerSeconds + secondPlayerSeconds + thirdPlayerSeconds;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if(seconds < 10) {
            System.out.println(minutes + ":0"+ seconds);
        } else {
            System.out.println(minutes + ":"+ seconds);

        }

    }
}
