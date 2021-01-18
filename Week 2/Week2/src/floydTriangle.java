import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        int numRows = getIntInput("Enter the number of rows: ");
        String lastStartChar = "1";
        String nextChar = "1";
        for(int i=0; i<numRows; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(nextChar);
                if (nextChar=="0")
                {
                    nextChar="1";
                }
                else
                {
                    nextChar="0";
                }
            }
            System.out.print("\n");
            if(lastStartChar=="0")
            {
                nextChar = "1";
                lastStartChar = "1";

            }
            else{
                nextChar = "0";
                lastStartChar = "0";
            }
        }
    }

    private static int getIntInput(String prompt) {
        System.out.println(prompt);
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        return x;
    }
}
