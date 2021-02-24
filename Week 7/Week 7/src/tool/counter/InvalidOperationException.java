package tool.counter;

public class InvalidOperationException extends Exception {
    public InvalidOperationException(String msg)
    {
        super(new String(msg));
    }
}
