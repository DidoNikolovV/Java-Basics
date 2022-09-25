import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int facebookPenalty = 150;
        int instagramPenalty = 100;
        int redditPenalty = 50;

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<openTabs;i++) {
            String websiteName = scanner.nextLine();

            if(websiteName.equals("Facebook")) {
                salary-= facebookPenalty;
            } else if(websiteName.equals("Instagram")) {
                salary -= instagramPenalty;
            } else if(websiteName.equals("Reddit")) {
                salary -= redditPenalty;
            }

            if(salary <=0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if(salary > 0) {
            System.out.println(salary);
        }
    }
}
