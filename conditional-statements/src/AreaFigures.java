import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double area = 0.00;

        if(figureType.equals("square")) {
            double length = Double.parseDouble(scanner.nextLine());
            area = length * length;
        } else if(figureType.equals("rectangle"))  {
            double lengthA = Double.parseDouble(scanner.nextLine());
            double lengthB = Double.parseDouble(scanner.nextLine());
            area = lengthA * lengthB;
        } else if(figureType.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * Math.pow(radius, 2);
        } else if(figureType.equals("triangle")) {
            double lengthA = Double.parseDouble(scanner.nextLine());
            double lengthB = Double.parseDouble(scanner.nextLine());
            area = lengthA * lengthB * 0.5;
        }

        System.out.printf("%.3f", area);
    }
}
