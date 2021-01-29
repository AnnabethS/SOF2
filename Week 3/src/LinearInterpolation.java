public class LinearInterpolation {
    public static int[] resample(int[] data) {
        int newLength = ((data.length - 1) * 2) + 1;
        int[] newArray = new int[newLength];
        for (int i=0; i<data.length; i++)
        {
            newArray[i*2] = data[i];
        }

        for (int i=0; i<newArray.length; i++)
        {
            if (newArray[i]==0)
            {
                newArray[i] = (newArray[i-1] + newArray[i+1]) / 2;
            }
        }

        return newArray;
    }

    public static float interpolate(float y0, float y1, float x, float x0, float x1) {
        return (((y0*(x1-x)) + (y1*(x-x0))) / (x1 - x0));
    }

    public static int[] resample(int[] data, int scale) {
        int newLength = ((data.length - 1) * scale) + 1;
        int[] newArray = new int[newLength];
        for (int i=0; i<data.length; i++)
        {
            newArray[i*scale] = data[i];
        }

        newArray = interpolateRow(newArray, scale);

        return newArray;
    }

    public static int[] interpolateRow(int[] newArray, int scale) {
        for (int i=0; i<newArray.length; i++)
        {
            int gapPos = i % scale;
            if (gapPos!=0)
            {
                newArray[i] = (int)interpolate(newArray[i-gapPos], newArray[i+(scale - gapPos)], gapPos, 0, scale);
            }
        }

        return newArray;
    }

    public static int[][] interpolateColumn(int[][] newArray, int scale, int column) {
        for (int i = 0; i < newArray.length; i++) {
            int gapPos = i % scale;
            if (gapPos!=0) {
                newArray[i][column] = (int)interpolate(newArray[i-gapPos][column], newArray[i+(scale - gapPos)][column], gapPos, 0, scale);
            }
        }
        return newArray;
    }

    public static int[][] resample(int[][] data, int scale)
    {
        int newLength = ((data.length - 1) * 2) + 1;
        int[][] newArray = new int[newLength][newLength];
        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data.length; j++)
            {
                newArray[i*scale][j*scale] = data[i][j];
            }
        }
        for(int i=0; i<newArray.length; i=i+2)
        {
            newArray[i] = interpolateRow(newArray[i], scale);
        }
        for (int i = 0; i < newArray[0].length; i++) {
            newArray = interpolateColumn(newArray, scale, i);
        }
        return newArray;
    }

    public static void printArray(int[] data) {
        for (int i : data) {
            System.out.print(i + ", ");
        }
        System.out.print("\n");
    }

    public static void printArray(int[][] data)
    {
        for (int[] i : data) {
            printArray(i);
        }
    }

    public static void main(String[] args) {
        // printArray(resample(new int[]{1,5,13,21}, 3));
        int[][] inputArray = new int[][]{
            {1,50,20,20},
            {100,255,150,30},
            {10,255,130,210},
            {10,255,130,210}
        };
        printArray(inputArray);
        System.out.println("***************************************\n");
        printArray(resample(inputArray, 2));
    }
}
