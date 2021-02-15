public class ArrayDictionary {
    int size = 100;
    String[] values;
    Integer[] keys;

    public ArrayDictionary()
    {
        constructArray();
    }

    public ArrayDictionary(int size)
    {
        this.size = size;
        constructArray();
    }

    private void constructArray()
    {
        values = new String[size];
        keys = new Integer[size];
    }

    public String toString()
    {
        StringBuilder newString = new StringBuilder();
        newString.append("{");
        for (int i=0; i<size; i++)
        {
            if(values[i]!=null & keys[i]!=null)
            {
                newString.append(keys[i] + ":" + values[i] + ", ");
            }
        }
        if (newString.length()!=1) 
        {
            newString.deleteCharAt(newString.length()-1);
            newString.deleteCharAt(newString.length()-1);
        }
        newString.append("}");
        return newString.toString();
    }

    public String put(Integer key, String value)
    {
        int firstNull = -1;
        for (int i = 0; i < keys.length; i++) {
            if (firstNull!=-1 & keys[i]==null)
            {
                firstNull = i;
            }
            else if (key==keys[i])
            {
                String oldValue = values[i];
                values[i] = value;
                return oldValue;
            }
        }
        if (firstNull==-1) 
        { //the arrayDict has completely full and must be expanded
            size = size*2;
        }
        keys[firstNull] = key;
        values[firstNull] = value;
        return null;
    }

    public static void main(String[] args) {
        ArrayDictionary test = new ArrayDictionary();
        System.out.println(test);
    }
}
