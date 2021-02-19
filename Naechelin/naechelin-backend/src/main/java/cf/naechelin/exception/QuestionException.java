package cf.naechelin.exception;

public abstract class QuestionException extends RuntimeException
{
    private final static String MESSAGE = "Question Error";
    private String message;

    public QuestionException()
    {
        super(MESSAGE);
    }

    public QuestionException(String message)
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
