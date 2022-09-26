import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int tournamentsWon = 0;
        int averagePoints = 0;
        for(int i = 0; i < tournamentsCount; i++) {
            String reachedStage = scanner.nextLine();
            if(reachedStage.equals("W")) {
                averagePoints += 2000;
                startingPoints+= 2000;
                tournamentsWon++;
            } else if(reachedStage.equals("F")){
                startingPoints += 1200;
                averagePoints += 1200;
            } else if(reachedStage.equals("SF")) {
                startingPoints += 720;
                averagePoints += 720;
            }
        }

        averagePoints /= tournamentsCount;
        double percentWon = (double)tournamentsWon / tournamentsCount * 100;

        System.out.printf("Final points: %d\n", startingPoints);
        System.out.printf("Average points: %d\n", averagePoints);
        System.out.printf("%.2f", percentWon);
        System.out.println("%");

    }
}
