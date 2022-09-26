import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int appraisersCount = Integer.parseInt(scanner.nextLine());
        boolean isNominated = false;

        for(int i=0;i <appraisersCount; i++) {
            String appraiserName = scanner.nextLine();
            double appraiserPoints = Double.parseDouble(scanner.nextLine());

            points += appraiserName.length() * appraiserPoints / 2;

            if(points >= 1250.5) {
                isNominated = true;
                break;
            }
        }

        if(isNominated) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.2f!", name, points);
        } else {
            System.out.printf("Sorry, %s you need %f more!", name, 1250 - points);
        }
    }
}
