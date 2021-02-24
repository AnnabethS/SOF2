package tool.counter;

public interface ITallyCounter {
    public void increment() throws InvalidOperationException;

    public void reset();

    public Integer read();
}
