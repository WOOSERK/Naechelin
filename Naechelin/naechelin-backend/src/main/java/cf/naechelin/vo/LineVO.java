package cf.naechelin.vo;

import java.awt.image.BufferedImage;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

public class LineVO
{
    private int lineId;
    private int memberId;
    private Timestamp lineCreateTime;
    private CouponVO coupon;
    private MemberVO member;
    private List<MissionVO> missionList;
    private MissionVO nextMission;
    private BufferedImage QR;

    public LineVO() {}

    public LineVO(int lineId, int memberId, Timestamp lineCreateTime, CouponVO coupon, MemberVO member, List<MissionVO> missionList, MissionVO nextMission, BufferedImage QR)
    {
        this.lineId = lineId;
        this.memberId = memberId;
        this.lineCreateTime = lineCreateTime;
        this.coupon = coupon;
        this.member = member;
        this.missionList = missionList;
        this.nextMission = nextMission;
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

    public Timestamp getLineCreateTime()
    {
        return lineCreateTime;
    }

    public void setLineCreateTime(Timestamp lineCreateTime)
    {
        this.lineCreateTime = lineCreateTime;
    }

    public CouponVO getCoupon()
    {
        return coupon;
    }

    public void setCoupon(CouponVO coupon)
    {
        this.coupon = coupon;
    }

    public MemberVO getMember()
    {
        return member;
    }

    public void setMember(MemberVO member)
    {
        this.member = member;
    }

    public List<MissionVO> getMissionList()
    {
        return missionList;
    }

    public void setMissionList(List<MissionVO> missionList)
    {
        this.missionList = missionList;
    }

    public MissionVO getNextMission()
    {
        return nextMission;
    }

    public void setNextMission(MissionVO nextMission)
    {
        this.nextMission = nextMission;
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

        LineVO lineVO = (LineVO) o;

        return lineId == lineVO.lineId;
    }

    @Override
    public int hashCode()
    {
        return lineId;
    }

    @Override
    public String toString()
    {
        return "LineVO{" +
                "lineId=" + lineId +
                ", memberId=" + memberId +
                ", lineCreateTime=" + lineCreateTime +
                ", coupon=" + coupon +
                ", member=" + member +
                ", missionList=" + missionList +
                ", nextMission=" + nextMission +
                '}';
    }

    public HashMap<String, Object> convertMap()
    {
        HashMap<String, Object> map = new HashMap<>();

        map.put("lineid", lineId);
        map.put("memberId", memberId);
        map.put("lineCreateTime", lineCreateTime);
        map.put("coupon", coupon);
        map.put("member", member);
        map.put("missionList", missionList);
        map.put("nextMission", nextMission);
        map.put("QR", QR);

        return map;
    }
}
