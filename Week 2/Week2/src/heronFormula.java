import java.util.Scanner;

public class heronFormula {

    public static void main(String[] args) {
        int a = getIntInput("Enter Side A's Length: ");
        int b = getIntInput("\nEnter Side B's Length: ");
        int c = getIntInput("\nEnter Side C's Length: ");
        System.out.print("\n" + a + " " + b + " " + c);
        float s = (a + b + c) / 2f;
        System.out.print("\n" + s);
        double area = Math.sqrt((s * (s-a) * (s-b) * (s-c)));
        System.out.print("\nThe Area of the triangle is: " + area);
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        return x;
    }
}
