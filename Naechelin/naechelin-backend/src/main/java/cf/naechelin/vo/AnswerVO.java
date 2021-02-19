package cf.naechelin.vo;

import java.sql.Timestamp;

public class AnswerVO
{
    private int questionId;
    private String answerContent;
    private Timestamp answerWriteDate;
    private QuestionVO question;

    public AnswerVO() { }

    public AnswerVO(int questionId, String answerContent, Timestamp answerWriteDate, QuestionVO question)
    {
        this.questionId = questionId;
        this.answerContent = answerContent;
        this.answerWriteDate = answerWriteDate;
        this.question = question;
    }

    public int getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(Object param)
    {
        this.questionId = questionId;
    }

    public String getAnswerContent()
    {
        return answerContent;
    }

    public void setAnswerContent(Object param)
    {
        this.answerContent = answerContent;
    }

    public Timestamp getAnswerWriteDate()
    {
        return answerWriteDate;
    }

    public void setAnswerWriteDate(Object param)
    {
        this.answerWriteDate = answerWriteDate;
    }

    public QuestionVO getQuestion()
    {
        return question;
    }

    public void setQuestion(Object param)
    {
        this.question = question;
    }
}
