package cf.naechelin.exception;

public abstract class MemberException extends RuntimeException
{
    private final static String MESSAGE = "Member Error";
    private String message;
    
    public MemberException() 
    {
        super(MESSAGE);
    }
    
    public MemberException(String message)
    {
        this.message = message;
    }
    
    @Override
    public String getMessage()
    {
        return message;
    }
    
    public void setMessage(String message)
    {
        this.message = message;
    }
}
