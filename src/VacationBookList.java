import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesReadPerHour = Integer.parseInt(scanner.nextLine());
        int daysAmountToRead = Integer.parseInt(scanner.nextLine());

        int hours = pages / pagesReadPerHour;
        int neededHours = hours / daysAmountToRead;
        System.out.println(neededHours);
    }
}
