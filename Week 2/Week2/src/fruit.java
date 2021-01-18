import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        float costPerKilo = 3.0f;
        float postagePrice = 4.99f;
        float discountThreshold = 50.0f;
        float discountPostage = 1.50f;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of fruit wanted in kg (must be integer)... ");
        int amount = keyboard.nextInt();
        keyboard.close();
        float total = costPerKilo * amount;
        if (total>discountThreshold) {
            total = total - discountPostage;
        }
        total = total + postagePrice;
        System.out.print("\nYour Order Will Cost: " + total);
    }
}
