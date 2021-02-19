package cf.naechelin.exception;

public class ReviewException extends RuntimeException
{
    private final static String MESSAGE = "Review Anything Error";
    private String message;
    public ReviewException(){
        super(MESSAGE);
    }

    public ReviewException(String message){
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message){this.message=message;}
}
