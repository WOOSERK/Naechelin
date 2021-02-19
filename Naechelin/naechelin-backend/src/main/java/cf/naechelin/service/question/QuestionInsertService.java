package cf.naechelin.service.question;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.QuestionVO;

public interface QuestionInsertService
{
    void doService(QuestionVO question) throws QuestionException;
}
