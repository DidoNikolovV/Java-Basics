import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int restDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = restDuration * 0.125;
        double reacrationTime = restDuration * 0.25;

        double total = lunchTime + reacrationTime;

        double result = restDuration - total;

        if(result >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(result - episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(episodeDuration - result));
        }
    }
}
