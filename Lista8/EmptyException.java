package Lista8;

public class EmptyException extends Exception
{
    public EmptyException()
    {
        super();
    }

    public EmptyException(String errMessage)
    {
        super(errMessage);
    }
}