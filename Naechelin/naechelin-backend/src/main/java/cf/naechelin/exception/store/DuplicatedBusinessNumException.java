package cf.naechelin.exception.store;

public class DuplicatedBusinessNumException extends StoreException
{
    public static final String MESSAGE = "사업자등록번호가 일치 합니다.";

    public DuplicatedBusinessNumException()
    {
        this(MESSAGE);
    }

    public DuplicatedBusinessNumException(String message)
    {
        super(message);
    }
}
