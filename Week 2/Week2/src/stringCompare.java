import java.util.Scanner;

public class stringCompare {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String string1 = keyboard.nextLine();
        System.out.println("Enter string 2: ");
        String string2 = keyboard.nextLine();
        keyboard.close();
        int iterations = string1.length();
        if (string2.length()>iterations)
        {
            iterations = string2.length();
        }
        StringBuilder outputString = new StringBuilder();
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        for (int i=0; i<iterations; i++)
        {
            if(i>=string1.length() || i>=string2.length())
            {
                outputString.append("0");
            }
            else if (chars1[i]==chars2[i])
            {
                outputString.append("1");
            }
            else
            {
                outputString.append("0");
            }
        }
        System.out.println("Your String is: " + outputString.toString());
    }
}
