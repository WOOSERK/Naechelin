package cf.naechelin.service.question;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.QuestionVO;

public interface QuestionUpdateService
{
    void doService(QuestionVO question) throws QuestionException;

}
