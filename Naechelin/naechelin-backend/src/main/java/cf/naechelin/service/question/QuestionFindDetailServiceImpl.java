package cf.naechelin.service.question;

import cf.naechelin.dao.QuestionDAO;
import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.QuestionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("questionFindDetailService")
public class QuestionFindDetailServiceImpl implements QuestionFindDetailService
{
    @Autowired
    @Qualifier("questionDAO")
    private QuestionDAO dao;

    @Override
    public void doService(QuestionVO question) throws QuestionException
    {
        dao.selectByQuestionContent(question.getQuestionContent());
    }
}
