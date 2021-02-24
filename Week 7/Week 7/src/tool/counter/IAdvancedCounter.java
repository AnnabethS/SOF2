package tool.counter;

public interface IAdvancedCounter extends ITallyCounter{
    public void decrement() throws InvalidOperationException;
}
