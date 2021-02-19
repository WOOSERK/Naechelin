package cf.naechelin.mapper;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.AnswerVO;

public interface AnswerMapper
{
    void insert(AnswerVO answer) throws QuestionException;
    void delete(int questionId) throws QuestionException;
    AnswerVO selectByAnswerContent(String answerContent) throws QuestionException;
}
