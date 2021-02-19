package cf.naechelin.exception.store;

public class StoreDeleteFailException extends StoreException
{
    public static final String MESSAGE = "매장 등록에 실패했습니다.";

    public StoreDeleteFailException()
    {
        this(MESSAGE);
    }
    public StoreDeleteFailException(String message)
    {
        super(message);
    }
}
