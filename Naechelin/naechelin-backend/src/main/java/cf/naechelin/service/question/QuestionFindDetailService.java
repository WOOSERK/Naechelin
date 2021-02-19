package cf.naechelin.service.question;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.QuestionVO;

public interface QuestionFindDetailService
{
    void doService(QuestionVO question) throws QuestionException;
}
