import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sellsAmount = Double.parseDouble(scanner.nextLine());
        double commision = 0;

        if(town.equals("Sofia")) {
            if(sellsAmount >= 0 && sellsAmount <= 500) {
                commision = sellsAmount * 0.05;
            } else if(sellsAmount > 500 && sellsAmount <= 1000) {
                commision = sellsAmount * 0.07;
            } else if(sellsAmount > 1000 && sellsAmount <= 10000) {
                commision = sellsAmount * 0.08;
            } else if(sellsAmount > 10000) {
                commision = sellsAmount * 0.12;
            }
        } else if(town.equals("Varna")) {
            if(sellsAmount >= 0 && sellsAmount <= 500) {
                commision = sellsAmount * 0.045;
            } else if(sellsAmount > 500 && sellsAmount <= 1000) {
                commision = sellsAmount * 0.075;
            } else if(sellsAmount > 1000 && sellsAmount <= 10000) {
                commision = sellsAmount * 0.1;
            } else if(sellsAmount > 10000) {
                commision = sellsAmount * 0.13;
            }
        } else if(town.equals("Plovdiv")) {
            if(sellsAmount >= 0 && sellsAmount <= 500) {
                commision = sellsAmount * 0.055;
            } else if(sellsAmount > 500 && sellsAmount <= 1000) {
                commision = sellsAmount * 0.08;
            } else if(sellsAmount > 1000 && sellsAmount <= 10000) {
                commision = sellsAmount * 0.12;
            } else if(sellsAmount > 10000) {
                commision = sellsAmount * 0.145;
            }
        }

        if(commision == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commision);
        }
    }
}
