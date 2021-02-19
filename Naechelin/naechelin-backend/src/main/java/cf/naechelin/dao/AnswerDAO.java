package cf.naechelin.dao;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.AnswerVO;

public interface AnswerDAO
{
    void insert(AnswerVO answer) throws QuestionException;
    void delete(int questionId) throws QuestionException;
    AnswerVO selectByAnswerContent(String answerContent) throws QuestionException;
}
