import java.util.ArrayList;

public class App {
    public static int toBase10(String binary) {
        int total = 0;
        int strLen = binary.length();
        for(int i=0; i<strLen; i++)
        {
            if (binary.charAt(strLen - 1 - i) == '1') {
                total = total + (int)Math.pow(2, i);  
            }
        }
        return total;
    }

    public static ArrayList split(String inputString)
    {
        ArrayList<String> outputList = new ArrayList<String>();
        StringBuilder newString = new StringBuilder();
        for(int i=0; i<inputString.length(); i++)
        {
            if (inputString.charAt(i)!=' ') 
            {
                newString.append(inputString.charAt(i));
            }
            else if (newString.length()!=0) 
            {
                outputList.add(newString.toString());
                newString = new StringBuilder();
            }
        }
        if (newString.length()!=0) 
        {
            outputList.add(newString.toString());
        }
        return outputList;
    }

    public static ArrayList split(String inputString, String separators)
    {
        ArrayList<String> outputList = new ArrayList<String>();
        StringBuilder newString = new StringBuilder();
        for(int i=0; i<inputString.length(); i++)
        {
            boolean isSeparator = false;
            for(int j=0; j<separators.length(); j++)
            {
                if (inputString.charAt(i)==separators.charAt(j)) {
                    isSeparator = true;
                    break;
                }
            }
            if (!isSeparator) 
            {
                newString.append(inputString.charAt(i));
            }
            else if (newString.length()!=0) 
            {
                outputList.add(newString.toString());
                newString = new StringBuilder();
            }
        }
        if (newString.length()!=0) 
        {
            outputList.add(newString.toString());
        }
        return outputList;
    }

    public static int[][] rasterise(int[] data, int width) {
        if ((data.length % width)!=0) {
            return null;
        }
        int rowAmount = data.length / width;
        int[][] array2D = new int[rowAmount][width];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = data[(i*width)+j];
            }
        }
        return array2D;
    }

    public static void main(String[] args) throws Exception {
        int num = toBase10("10001011");
        System.out.println(num);
        ArrayList<String> output = split("the cat jumped over the rug or something");
        System.out.println(output.toString());
        output = split("the,cat,jumped,over,the/rug/or something", ",./ ");
        System.out.println(output);
        int[][] output2 = rasterise(new int[]{1,2,3,4,5,6,7,8}, 4);
        System.out.println(output2.toString());
        System.out.println("END");
    }
}
