import java.util.Scanner;

public class whiteSpaceRemover {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String userstring = keyboard.nextLine();
        keyboard.close();
        char[] chars = userstring.toCharArray();
        StringBuilder newString = new StringBuilder();
        Boolean lastCharSpace = true;
        for (char c : chars) {
            if(c==' '){
                lastCharSpace = true;
                continue;
            }
            else{
                if (lastCharSpace) {
                    newString.append("\n");
                    newString.append(Character.toUpperCase(c));
                }
                else{
                    newString.append(Character.toLowerCase(c));
                }
                lastCharSpace = false;
            }
        }
        userstring = newString.toString();
        System.out.print(userstring);
    }
}
