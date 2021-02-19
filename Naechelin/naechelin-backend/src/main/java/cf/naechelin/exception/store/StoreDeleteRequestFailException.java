package cf.naechelin.exception.store;

public class StoreDeleteRequestFailException extends StoreException
{
    public static final String MESSAGE = "매장 삭제 요청이 실패 하였습니다.";

    public StoreDeleteRequestFailException()
    {
        this(MESSAGE);
    }
    public StoreDeleteRequestFailException(String message)
    {
        super(message);
    }
}
