package cf.naechelin.exception.store;

public class StoreInsertRequestFailException extends StoreException
{
    public static final String MESSAGE = "매장등록요청에 실패하였습니다.";
    public StoreInsertRequestFailException()
    {
        this(MESSAGE);
    }
    public StoreInsertRequestFailException(String message)
    {
        super(message);
    }
}
