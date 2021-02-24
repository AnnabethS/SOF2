package tool.counter;

public class BetterTallyCounter implements IAdvancedCounter{

    private int digits;
    private int count;

    public void increment() throws InvalidOperationException
    {
        if(count+1 < Math.pow(10, digits))
        {
            count++;
        }
        else
        {
            throw new InvalidOperationException("This is an invalid operation, the counter already has" + 
            "the maximum value and therefore cannot be incremented");
        }
    }

    public void decrement() throws InvalidOperationException
    {
        if(count-1 > 0)
        {
            count--;
        }
        else
        {
            throw new InvalidOperationException("This is an invalid operation, the counter already has" + 
            "the minimum value and therefore cannot be decremented");
        }
    }

    public void reset() 
    {
        count = 0;
    }

    public Integer read() 
    {
        return count;
    }

    public String toString()
    {
        return String.format("%0" + digits + "d", count);
    }
}
