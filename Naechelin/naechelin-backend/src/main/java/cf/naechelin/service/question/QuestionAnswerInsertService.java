package cf.naechelin.service.question;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.AnswerVO;

public interface QuestionAnswerInsertService
{
    void doService(AnswerVO answer) throws QuestionException;
}
