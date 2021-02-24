package algebra;

public class Vector {

    double[] vector;

    public Vector(double[] data){
        vector = data.clone();
    }

    public int size(){
        return vector.length;
    }

    @Override
    public String toString(){
        StringBuffer output = new StringBuffer("[");
        for(int i = 0; i < vector.length - 1; i++){
            output.append(vector[i] + ", ");
        }
        output.append(vector[vector.length - 1] + "]");
        return output.toString();
    }

    public double get(int index){
        // InvalidDimensionException is an unchecked exception and therefore 
        // does not need to be claimed in the method's header.
        if(index >= vector.length | index<0){
            throw new InvalidDimensionException(Integer.toString(index));
        }
        return vector[index];
    }

    public double set(int index, double value){
        // InvalidDimensionException is an unchecked exception and therefore 
        // does not need to be claimed in the method's header.
        if(index < 0 || index >= vector.length){
            throw new InvalidDimensionException(Integer.toString(index));
        }

        double old = vector[index];
        vector[index] = value;
        return old;
    }

    public Vector scalarProduct(double scalar){
        double[] data = new double[size()];
        for (int i = 0; i < vector.length; i++) {
            data[i] = scalar * get(i);
        }
        return new Vector(data);
    }

    public Vector add(Vector other) throws IncompatibleDimensionException{
        if(size() != other.size())
        {
            throw new IncompatibleDimensionException("Incompatible Dimensions");
        }
        double[] data = new double[size()];
        for (int i = 0; i < data.length; i++) {
            data[i] = other.get(i) + this.get(i);
        }
        return new Vector(data);
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(!(other instanceof Vector)){
            return false;
        }
        Vector v = (Vector) other;
        if(this.size() != v.size()){
            return false;
        }
        for (int i = 0; i < vector.length; i++) {
                if(v.get(i) != this.get(i)){
                    return false;
                }
        }
        // if we are here, the two vector have the same dimension and the same 
        // values, therefore they are equals.
        return true;
    }
}