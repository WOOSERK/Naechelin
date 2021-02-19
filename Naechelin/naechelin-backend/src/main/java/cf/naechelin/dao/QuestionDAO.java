package cf.naechelin.dao;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.QuestionVO;

import java.util.List;

public interface QuestionDAO
{
    void insert(QuestionVO question) throws QuestionException;
    void update(QuestionVO question) throws QuestionException;
    void delete(int questionId) throws QuestionException;
    QuestionVO selectByQuestionTitle(String questionTitle) throws QuestionException;
    QuestionVO selectByQuestionContent(String questionContent) throws QuestionException;
    List<QuestionVO> list() throws QuestionException;
}
