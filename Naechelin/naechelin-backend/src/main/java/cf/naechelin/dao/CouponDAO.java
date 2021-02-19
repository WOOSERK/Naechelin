package cf.naechelin.dao;

import cf.naechelin.vo.CouponVO;
import cf.naechelin.vo.QueryVO;

import java.awt.image.BufferedImage;
import java.util.List;

public interface CouponDAO
{
    void insert(CouponVO coupon);
    void delete(int lineId);
    CouponVO view(int lineId);
    List<CouponVO> list(QueryVO query);
    BufferedImage createQR(int lineId);
}
