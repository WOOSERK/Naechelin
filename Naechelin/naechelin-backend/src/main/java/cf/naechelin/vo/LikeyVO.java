// LikeyVO jeonka1001 2020.08.15
package cf.naechelin.vo;

import java.util.Objects;

public class LikeyVO
{
    private int memberId;
    private int storeId;

    public LikeyVO() { }

    public LikeyVO(int memberId, int storeId)
    {
        this.storeId = storeId;
        this.memberId = memberId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public int getMemberId()
    {
        return memberId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikeyVO likeyVO = (LikeyVO) o;
        return storeId == likeyVO.storeId &&
                memberId == likeyVO.memberId;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(storeId, memberId);
    }

}
