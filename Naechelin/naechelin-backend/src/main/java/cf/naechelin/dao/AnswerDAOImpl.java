package cf.naechelin.dao;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.mapper.AnswerMapper;
import cf.naechelin.vo.AnswerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("answerDAO")
public class AnswerDAOImpl implements AnswerDAO
{
    @Autowired
    AnswerMapper answerMapper;

    @Override
    public void insert(AnswerVO answer) throws QuestionException
    {
        answerMapper.insert(answer);
    }

    @Override
    public void delete(int questionId) throws QuestionException
    {
        answerMapper.delete(questionId);
    }

    @Override
    public AnswerVO selectByAnswerContent(String answerContent) throws QuestionException
    {
        return answerMapper.selectByAnswerContent(answerContent);
    }
}
