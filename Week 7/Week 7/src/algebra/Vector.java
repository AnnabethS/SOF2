package algebra;

public class Vector {
    
    private double[] vector;

    public Vector(double[] inputVector)
    {
        vector = inputVector.clone();
    }

    public int size()
    {
        return vector.length;
    }

    public double get(int index)
    {
        if(index<0 | index>=vector.length)
        {
            throw new algebra.InvalidDimensionException(new String("Invalid Dimension in Vector"));
        }
        return vector[index];
    }

    public double set(int index, double value)
    {
        if(index<0 | index>=vector.length)
        {
            throw new algebra.InvalidDimensionException(new String("Invalid Dimension in Vector"));
        }
        double oldValue = vector[index];
        vector[index] = value;
        return oldValue;
    }

    public Vector scalarProduct(double scalar)
    {
        double[] newVector = vector.clone();
        for (int i = 0; i < newVector.length; i++) {
            newVector[i] = newVector[i] * scalar;
        }
        return new Vector(newVector);
    }

    public Vector add(Vector other) throws IncompatibleDimensionException
    {
        if (vector.length != other.size()) {
            throw new IncompatibleDimensionException("Vectors do not have the same dimension, they cannot be added");
        }
        double[] newVector = new double[vector.length];
        for (int i=0; i<vector.length; i++)
        {
            newVector[i] = vector[i] + other.get(i);
        }
        return new Vector(newVector);
    }

    public String toString()
    {
        StringBuilder outputString = new StringBuilder();
        outputString.append("[");
        outputString.append(vector[0]);
        for(int i=1; i<vector.length; i++)
        {
            outputString.append(", " + vector[i]);
        }
        outputString.append("]");
        return outputString.toString();
    }

    public boolean equals(Object other)
    {
        if(!(other instanceof Vector))
        {
            return false;
        }
        Vector otherVector = (Vector) other;
        if(vector.length==otherVector.size())
        {
            for (int i = 0; i < vector.length; i++) 
            {
                if (vector[i]!=otherVector.get(i)) 
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        return true;
    }   

    public static void main(String[] args) {
        Vector newVector = new Vector(new double[]{1.2, 3.4, 5.6});
        Vector vector2 = new Vector(new double[]{2.3, 4.6, 7.2});
        System.out.println(newVector);
        System.out.println(newVector.scalarProduct(2));
        try {
            System.out.println(newVector.add(vector2));
        } catch (Exception e) {
            System.out.println("The vectors failed to add. Error Message Follows...");
            System.out.println(e.toString());
        }
        System.out.println(vector2.equals(newVector));
        System.out.println(vector2.equals(vector2));
        System.out.println(vector2.equals(null));
    }
}
