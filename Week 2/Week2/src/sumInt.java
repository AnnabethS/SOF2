import java.util.Scanner;

public class sumInt {
    public static void main(String[] args) {
        int num = 0;
        int total = 0;
        num = getIntInput("Enter a number... ");
        while (num!=0) {
            total += num;
            num = getIntInput("Enter a number (0 to exit)... ");
        }
        System.out.println("Your Total is... " + total);
    }

    private static int getIntInput(String prompt) {
        System.out.println(prompt);
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        return x;
    }
}
