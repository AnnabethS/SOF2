public class Line {
    
    private Point start;
    private Point end;
    private String color;

    public Point getStart() {
        return this.start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Line(Point startPoint, Point endPoint)
    {
        start = startPoint;
        end = endPoint;
        color = "black";
    }

    public String toString()
    {
        return "A line with start point: " + start.toString() + " and end point: " + end.toString() + " with color: " + color + ".";
    }

}
