package cf.naechelin.vo;

public class QueryVO
{
    private String condition;
    private String word;
    private int intWord;

    public QueryVO() {}

    public QueryVO(String condition, String word)
    {
        this.condition = condition;
        this.word = word;
    }

    public QueryVO(String condition, int intWord)
    {
        this.condition = condition;
        this.intWord = intWord;
    }

    public QueryVO(String condition, String word, int intWord)
    {
        this.condition = condition;
        this.word = word;
        this.intWord = intWord;
    }

    public String getCondition()
    {
        return condition;
    }

    public void setCondition(String condition)
    {
        this.condition = condition;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public int getIntWord()
    {
        return intWord;
    }

    public void setIntWord(int intWord)
    {
        this.intWord = intWord;
    }
}
