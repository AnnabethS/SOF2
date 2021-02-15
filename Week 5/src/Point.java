public class Point {
    private double x;
    private double y;
    private String color;

    public Point()
    {
        x = 0d;
        y = 0d;
        color = "black";
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
        color = "black";
    }

    public String getColor() 
    {
        return this.color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public String toString()
    {
        return "A point with x = " + x + " and y = " + y + " and color: " + color;
    }
}
