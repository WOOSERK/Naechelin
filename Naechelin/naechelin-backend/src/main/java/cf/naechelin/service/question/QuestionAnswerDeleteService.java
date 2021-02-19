package cf.naechelin.service.question;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.AnswerVO;

public interface QuestionAnswerDeleteService
{
    void doService(AnswerVO answer) throws QuestionException;
}
