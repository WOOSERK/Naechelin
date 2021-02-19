package cf.naechelin.exception.store;

public class StoreInsertFailException extends StoreException
{
    public static final String MESSAGE = "매장 등록을 실패했습니다.";

    public StoreInsertFailException()
    {
        this(MESSAGE);
    }
    public StoreInsertFailException(String message)
    {
        super(message);
    }
}
