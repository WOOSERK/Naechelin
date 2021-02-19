package cf.naechelin.vo;

import java.sql.Timestamp;

public class QuestionVO
{
    private int questionId;
    private int memberId;
    private String questionTitle;
    private String questionContent;
    private Timestamp questionWriteDate;
    private MemberVO member;

    public QuestionVO() { }

    public QuestionVO(int questionId, int memberId, String questionTitle, String questionContent, Timestamp questionWriteDate, MemberVO member)
    {
        this.questionId = questionId;
        this.memberId = memberId;
        this.questionTitle = questionTitle;
        this.questionContent = questionContent;
        this.questionWriteDate = questionWriteDate;
        this.member = member;
    }

    public int getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(Object param)
    {
        this.questionId = questionId;
    }

    public int getMemberId()
    {
        return memberId;
    }

    public void setMemberId(Object param)
    {
        this.memberId = memberId;
    }

    public String getQuestionTitle()
    {
        return questionTitle;
    }

    public void setQuestionTitle(Object param)
    {
        this.questionTitle = questionTitle;
    }

    public String getQuestionContent()
    {
        return questionContent;
    }

    public void setQuestionContent(Object param)
    {
        this.questionContent = questionContent;
    }

    public Timestamp getQuestionWriteDate()
    {
        return questionWriteDate;
    }

    public void setQuestionWriteDate(Object param)
    {
        this.questionWriteDate = questionWriteDate;
    }

    public MemberVO getMember()
    {
        return member;
    }

    public void setMember(Object param)
    {
        this.member = member;
    }
}
