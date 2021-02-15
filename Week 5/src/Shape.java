public class Shape {
    
    private String color;
    private boolean filled;
    private double rotation;
    private double xPosition;
    private double yPosition;
    
    public Shape()
    {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String newColor)
    {
        color = newColor;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean newFilled)
    {
        filled = newFilled;
    }

    public String toString()
    {
        return ("A Shape with a color of " + color + " and is filled: " + filled + " which has a rotation of: " + rotation + " degrees and is at x position: " 
        + xPosition + "and y position: " + yPosition + ".");
    }

    public double getRotation() {
        return this.rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public double getXPosition() {
        return this.xPosition;
    }

    public void setXPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getYPosition() {
        return this.yPosition;
    }

    public void setYPosition(double yPosition) {
        this.yPosition = yPosition;
    }
}
