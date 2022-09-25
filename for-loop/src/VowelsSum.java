import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int result = 0;

        for(int i=0; i < text.length(); i++) {
            var character = text.charAt(i);
            if(character == 'a') {
                result += 1;
            } else if(character == 'e') {
                result += 2;
            } else if(character == 'i') {
                result += 3;
            } else if(character == 'o') {
                result += 4;
            } else if(character == 'u') {
                result +=5;
            }
        }

        System.out.println(result);

    }
}
