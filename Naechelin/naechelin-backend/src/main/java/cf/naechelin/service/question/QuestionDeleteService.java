package cf.naechelin.service.question;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.QuestionVO;

public interface QuestionDeleteService
{
    void doService(QuestionVO question) throws QuestionException;
}
