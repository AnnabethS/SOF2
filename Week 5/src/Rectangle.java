public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle()
    {
        super();
        width = 1d;
        length = 1d;
    }

    public Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() 
    {
        return this.width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getLength() 
    {
        return this.length;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public double getArea()
    {
        return width*length;
    }

    public double getPerimeter()
    {
        return (width*2)+(length*2);
    }
    
    public String toString()
    {
        return "A Rectangle of Length" + length + " and width " + width + " which is a subclass of: " + super.toString();
    }

}
