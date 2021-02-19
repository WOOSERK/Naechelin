package cf.naechelin.vo;

public class VisitVO
{
    private int storeId;
    private String missionSuccessTime;

    public VisitVO(){}

    public VisitVO(int storeId, String missionSuccessTime)
    {
        this.storeId = storeId;
        this.missionSuccessTime = missionSuccessTime;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public String getMissionSuccessTime()
    {
        return missionSuccessTime;
    }

    public void setMissionSuccessTime(String missionSuccessTime)
    {
        this.missionSuccessTime = missionSuccessTime;
    }
}
