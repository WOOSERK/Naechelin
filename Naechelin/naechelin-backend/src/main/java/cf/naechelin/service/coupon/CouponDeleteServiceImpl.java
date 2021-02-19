package cf.naechelin.service.coupon;

import cf.naechelin.dao.CouponDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("CouponDelete")
public class CouponDeleteServiceImpl implements CouponDeleteService
{
    @Autowired
    @Qualifier("CouponDAO")
    private CouponDAO dao;

    @Override
    public void doService(int lineId)
    {
        dao.delete(lineId);
    }
}
