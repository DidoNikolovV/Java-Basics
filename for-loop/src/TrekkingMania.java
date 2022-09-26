import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;
        for(int i=0; i<groups; i++) {
            int peopleAmount = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleAmount;
            if(peopleAmount <= 5) {
                musala+= peopleAmount;
            } else if(peopleAmount >=6 && peopleAmount <= 12) {
                monblan+=peopleAmount;
            } else if(peopleAmount >=13 && peopleAmount <= 25) {
                kilimandjaro+=peopleAmount;
            } else if(peopleAmount >=26 && peopleAmount <= 40) {
                k2+= peopleAmount;
            } else if(peopleAmount >= 41) {
                everest += peopleAmount;
            }
        }

        double percentMusala = (double)musala / totalPeople * 100;
        double percentMonblan = (double)monblan / totalPeople * 100;
        double percentKilimandjaro = (double)kilimandjaro / totalPeople * 100;
        double percentK2 = (double)k2 / totalPeople * 100;
        double percentEverest = (double)everest / totalPeople * 100;

        System.out.printf("%.2f", percentMusala);
        System.out.println("%");
        System.out.printf("%.2f", percentMonblan);
        System.out.println("%");
        System.out.printf("%.2f", percentKilimandjaro);
        System.out.println("%");
        System.out.printf("%.2f", percentK2);
        System.out.println("%");
        System.out.printf("%.2f", percentEverest);
        System.out.println("%");
    }
}
