import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class heartRate {
    public static void main(String[] args) {
        int age = getIntegerInput("Enter your age: ");
        int rate = getIntegerInput("Enter your training heart rate (BPM): ");
        double maxRate = 208 - 0.7*age;
        System.out.print("\n");
        if (rate>=(maxRate*0.9)) {
            System.out.print("Your Training Zone is Interval Training");
        }
        else if (rate >= (maxRate*0.7))
        {
            System.out.print("Your Training Zone is Threshold Training");
        }
        else if (rate >= (maxRate*0.5))
        {
            System.out.print("Your Training Zone is Aerobic Training");
        }
        else
        {
            System.out.print("Your Training Zone is Couch Potato");
        }
    }

    private static Integer getIntegerInput(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(prompt);
        int x = keyboard.nextInt();
        return x;
    }
}
