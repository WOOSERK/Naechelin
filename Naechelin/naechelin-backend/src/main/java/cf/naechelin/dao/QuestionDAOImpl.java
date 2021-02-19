package cf.naechelin.dao;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.mapper.QuestionMapper;
import cf.naechelin.vo.QuestionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("questionDAO")
public class QuestionDAOImpl implements QuestionDAO
{
    @Autowired
    QuestionMapper questionMapper;

    @Override
    public void insert(QuestionVO question) throws QuestionException
    {
        questionMapper.insert(question);
    }

    @Override
    public void update(QuestionVO question) throws QuestionException
    {
        questionMapper.update(question);
    }

    @Override
    public void delete(int questionId) throws QuestionException
    {
        questionMapper.delete(questionId);
    }

    @Override
    public QuestionVO selectByQuestionTitle(String questionTitle) throws QuestionException
    {
        return questionMapper.selectByQuestionTitle(questionTitle);
    }

    @Override
    public QuestionVO selectByQuestionContent(String questionContent) throws QuestionException
    {
        return questionMapper.selectByQuestionContent(questionContent);
    }

    @Override
    public List<QuestionVO> list() throws QuestionException
    {
        return questionMapper.list();
    }
}
