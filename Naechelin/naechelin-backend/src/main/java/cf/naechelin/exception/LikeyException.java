// likeyException jeonka 2020.08.15
package cf.naechelin.exception;

public class LikeyException extends RuntimeException
{
    private final static String MESSAGE = "Likey Anything Error";
    private String message;
    public LikeyException(){
        super(MESSAGE);
    }

    public LikeyException(String message){
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message){this.message=message;}
}
