// MemoVO jeonka1001 2020.08.15
package cf.naechelin.vo;

import java.util.Objects;

public class MemoVO
{
    private int storeId;
    private int memberId;
    private String memoPac;
    private String memoPhoto;
    private int memoRating;

    public MemoVO(){}

    public MemoVO(int storeId, int memberId, String memoPac, String memoPhoto, int memoRating)
    {
        this.storeId = storeId;
        this.memberId = memberId;
        this.memoPac = memoPac;
        this.memoPhoto = memoPhoto;
        this.memoRating = memoRating;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public int getMemberId()
    {
        return memberId;
    }

    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    public String getMemoPac()
    {
        return memoPac;
    }

    public void setMemoPac(String memoPac)
    {
        this.memoPac = memoPac;
    }

    public String getMemoPhoto()
    {
        return memoPhoto;
    }

    public void setMemoPhoto(String memoPhoto)
    {
        this.memoPhoto = memoPhoto;
    }

    public int getMemoRating()
    {
        return memoRating;
    }

    public void setMemoRating(int memoRating)
    {
        this.memoRating = memoRating;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemoVO memoVO = (MemoVO) o;
        return storeId == memoVO.storeId &&
                memberId == memoVO.memberId &&
                memoRating == memoVO.memoRating &&
                memoPac.equals(memoVO.memoPac) &&
                memoPhoto.equals(memoVO.memoPhoto);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(storeId, memberId, memoPac, memoPhoto, memoRating);
    }

}
