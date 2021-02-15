public class Square extends Rectangle{
    public Square()
    {
        super();
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return getLength();
    }

    public void setSide(double side)
    {
        setLength(side);
        setWidth(side);
    }

    public void setLength(double length)
    {
        setSide(length);
    }

    public void setWidth(double width)
    {
        setSide(width);
    }

    public String toString()
    {
        return "A square with side " + getLength() + " which is a subclass of : " + super.toString();
    }
}
