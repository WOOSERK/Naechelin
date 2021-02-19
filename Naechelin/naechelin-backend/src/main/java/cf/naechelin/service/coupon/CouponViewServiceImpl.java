package cf.naechelin.service.coupon;

import cf.naechelin.dao.CouponDAO;
import cf.naechelin.vo.CouponVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("CouponView")
public class CouponViewServiceImpl implements CouponViewService
{
    @Autowired
    @Qualifier("CouponDAO")
    private CouponDAO dao;

    @Override
    public CouponVO doService(int lineId)
    {
        CouponVO coupon = dao.view(lineId);
        coupon.setQR(dao.createQR(lineId));

        return coupon;
    }
}
