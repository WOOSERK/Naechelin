package cf.naechelin.exception.store;

public class StoreUpdateFailException extends StoreException
{
    public static final String MESSAGE = "매장 수정에 실패했습니다";

    public StoreUpdateFailException()
    {
        this(MESSAGE);
    }
    public StoreUpdateFailException(String message)
    {
        super(message);
    }
}
