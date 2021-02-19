public class TallyCounter {
    private int counter;
    private int digits;
    
    public TallyCounter() 
    {
        counter = 0;
        digits = 3;
    }

    public TallyCounter(int digits)
    {
        counter = 0;
        this.digits = digits;
    }

    public String toString()
    {
        return String.format("%0" + digits + "d", counter);
    }

    public void increment()
    {
        counter++;
        if (counter>=(Math.pow(10, digits)))
        {
            counter = 0;
        }
    }

    public void decrement()
    {
        counter--;
        if (counter<=0)
        {
            counter = 0;
        }
    }

    public void reset()
    {
        counter = 0;
    }

    public int read()
    {
        return counter;
    }
}
