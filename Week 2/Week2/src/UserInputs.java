import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = keyboard.nextInt();
        keyboard.close();
        System.out.print("Your Number Was: " + number);
    }
}
