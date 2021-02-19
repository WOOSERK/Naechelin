package cf.naechelin.vo;

import java.awt.image.BufferedImage;
import java.sql.Timestamp;
import java.util.HashMap;

public class CouponVO
{
    private int lineId;
    private int memberId;
    private int couponUsedStoreId;
    private Timestamp couponStart;
    private LineVO line;
    private MemberVO member;
    private StoreVO couponUsedStore;
    private BufferedImage QR;

    public CouponVO() {}

    public CouponVO(int lineId, int memberId, int couponUsedStoreId, Timestamp couponStart, LineVO line, MemberVO member, StoreVO couponUsedStore, BufferedImage QR)
    {
        this.lineId = lineId;
        this.memberId = memberId;
        this.couponUsedStoreId = couponUsedStoreId;
        this.couponStart = couponStart;
        this.line = line;
        this.member = member;
        this.couponUsedStore = couponUsedStore;
        this.QR = QR;
    }

    public int getLineId()
    {
        return lineId;
    }

    public void setLineId(int lineId)
    {
        this.lineId = lineId;
    }

    public int getMemberId()
    {
        return memberId;
    }

    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    public int getCouponUsedStoreId()
    {
        return couponUsedStoreId;
    }

    public void setCouponUsedStoreId(int couponUsedStoreId)
    {
        this.couponUsedStoreId = couponUsedStoreId;
    }

    public Timestamp getCouponStart()
    {
        return couponStart;
    }

    public void setCouponStart(Timestamp couponStart)
    {
        this.couponStart = couponStart;
    }

    public LineVO getLine()
    {
        return line;
    }

    public void setLine(LineVO line)
    {
        this.line = line;
    }

    public MemberVO getMember()
    {
        return member;
    }

    public void setMember(MemberVO member)
    {
        this.member = member;
    }

    public StoreVO getCouponUsedStore()
    {
        return couponUsedStore;
    }

    public void setCouponUsedStore(StoreVO couponUsedStore)
    {
        this.couponUsedStore = couponUsedStore;
    }

    public BufferedImage getQR()
    {
        return QR;
    }

    public void setQR(BufferedImage QR)
    {
        this.QR = QR;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CouponVO couponVO = (CouponVO) o;

        return lineId == couponVO.lineId;
    }

    @Override
    public int hashCode()
    {
        return lineId;
    }

    @Override
    public String toString()
    {
        return "CouponVO{" +
                "lineId=" + lineId +
                ", memberId=" + memberId +
                ", couponUsedStoreId=" + couponUsedStoreId +
                ", couponStart=" + couponStart +
                ", line=" + line +
                ", member=" + member +
                ", couponUsedStore=" + couponUsedStore +
                '}';
    }

    public HashMap<String, Object> convertMap()
    {
        HashMap<String, Object> map = new HashMap<>();

        map.put("lineid", lineId);
        map.put("memberId", memberId);
        map.put("couponUsedStoreId", couponUsedStoreId);
        map.put("couponStart", couponStart);
        map.put("line", line);
        map.put("member", member);
        map.put("couponUsedStore", couponUsedStore);
        map.put("QR", QR);

        return map;
    }
}
