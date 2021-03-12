import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести первое слово: ");
        String str1 =  scanner.nextLine();

        System.out.println("Ввести второе слово: ");
        String str2 = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '*') count++;
        }
        if (count > 0) {
            int index = str2.indexOf("*");
            String front1 = str1.substring(0, index);
            String front2 = str2.substring(0, index);

            if (front1.equals(front2)) {
                System.out.println("OK");
            } else {
                System.out.println("KO");
            }
        }
        if (count == 0 && str1.equals(str2)) {
            System.out.println("OK");
        }
        if (count == 0 && !str1.equals(str2)) {
            System.out.println("KO");
        }
    }
}




