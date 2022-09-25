import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double p1 = 0;
        double p2 = 0;
        double p3= 0;
        double p4 = 0;
        double p5 = 0;

        for(int i=0; i<n; i++) {
            int number = scanner.nextInt();

            if(number < 200) {
                p1++;
            } else if(number >= 200 && number <= 399) {
                p2++;
            } else if(number >= 400 && number <= 599) {
                p3++;
            } else if(number >= 600 && number <= 799) {
                p4++;
            } else if(number >= 800) {
                p5++;
            }
        }

        double p1Percent = p1 / n * 100;
        double p2Percent =  p2 / n * 100;
        double p3Percent=  p3 / n * 100;
        double p4Percent =  p4 / n * 100;
        double p5Percent =  p5 / n * 100;

        System.out.printf("%.2f", p1Percent);
        System.out.println("%");
        System.out.printf("%.2f", p2Percent);
        System.out.println("%");
        System.out.printf("%.2f", p3Percent);
        System.out.println("%");
        System.out.printf("%.2f", p4Percent);
        System.out.println("%");
        System.out.printf("%.2f", p5Percent);
        System.out.println("%");



    }
}
