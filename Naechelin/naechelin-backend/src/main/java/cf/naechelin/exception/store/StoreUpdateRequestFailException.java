package cf.naechelin.exception.store;

public class StoreUpdateRequestFailException extends StoreException
{
    public static final String MESSAGE = "매장 수정 요청에 실패하였습니다.";
    public StoreUpdateRequestFailException()
    {
        this(MESSAGE);
    }

    public StoreUpdateRequestFailException(String message)
    {
        super(message);
    }
}
