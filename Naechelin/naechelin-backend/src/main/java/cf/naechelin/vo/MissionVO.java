package cf.naechelin.vo;

import java.sql.Timestamp;
import java.util.HashMap;

public class MissionVO
{
    private int lineId;
    private int storeId;
    private int missionOrder;
    private Timestamp missionSuccessTime;
    private LineVO line;
    private StoreVO store;

    public MissionVO() {}

    public MissionVO(int lineId, int storeId, int missionOrder)
    {
        this.lineId = lineId;
        this.storeId = storeId;
        this.missionOrder = missionOrder;
    }

    public int getLineId()
    {
        return lineId;
    }

    public void setLineId(int lineId)
    {
        this.lineId = lineId;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public int getMissionOrder()
    {
        return missionOrder;
    }

    public void setMissionOrder(int missionOrder)
    {
        this.missionOrder = missionOrder;
    }

    public Timestamp getMissionSuccessTime()
    {
        return missionSuccessTime;
    }

    public void setMissionSuccessTime(Timestamp missionSuccessTime)
    {
        this.missionSuccessTime = missionSuccessTime;
    }

    public LineVO getLine()
    {
        return line;
    }

    public void setLine(LineVO line)
    {
        this.line = line;
    }

    public StoreVO getStore()
    {
        return store;
    }

    public void setStore(StoreVO store)
    {
        this.store = store;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionVO missionVO = (MissionVO) o;

        if (lineId != missionVO.lineId) return false;
        return storeId == missionVO.storeId;
    }

    @Override
    public int hashCode()
    {
        int result = lineId;
        result = 31 * result + storeId;
        return result;
    }

    @Override
    public String toString()
    {
        return "MissionVO{" +
                "lineId=" + lineId +
                ", storeId=" + storeId +
                ", missionOrder=" + missionOrder +
                ", missionSuccessTime=" + missionSuccessTime +
                ", line=" + line +
                ", store=" + store +
                '}';
    }

    public HashMap<String, Object> convertMap()
    {
        HashMap<String, Object> map = new HashMap<>();

        map.put("lineId", lineId);
        map.put("memberId", storeId);
        map.put("missionOrder", missionOrder);
        map.put("missionSuccessTime", missionSuccessTime);
        map.put("line", line);
        map.put("store", store);

        return map;
    }
}
