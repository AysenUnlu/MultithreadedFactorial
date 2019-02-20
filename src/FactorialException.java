public class FactorialException extends Exception {
    String str;
    public FactorialException(String s)
    {
        str=s;
    }
    @Override

    public String getMessage()
    {
        return str;
    }
}
