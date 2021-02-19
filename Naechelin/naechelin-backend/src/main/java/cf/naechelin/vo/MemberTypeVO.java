package cf.naechelin.vo;

public class MemberTypeVO
{
    private String memberType;
    private String membertypeName;

    public MemberTypeVO() { }

    public MemberTypeVO(String memberType, String membertypeName)
    {
        this.memberType = memberType;
        this.membertypeName = membertypeName;
    }

    public String getMemberType()
    {
        return memberType;
    }

    public void setMemberType(Object param)
    {
        this.memberType = memberType;
    }

    public String getMembertypeName()
    {
        return membertypeName;
    }

    public void setMembertypeName(Object param)
    {
        this.membertypeName = membertypeName;
    }
}
