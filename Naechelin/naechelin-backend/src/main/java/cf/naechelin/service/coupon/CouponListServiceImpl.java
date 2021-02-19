package cf.naechelin.service.coupon;

import cf.naechelin.dao.CouponDAO;
import cf.naechelin.vo.CouponVO;
import cf.naechelin.vo.QueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CouponList")
public class CouponListServiceImpl implements CouponListService
{
    @Autowired
    @Qualifier("CouponDAO")
    public CouponDAO dao;

    @Override
    public List<CouponVO> doService()
    {
        return dao.list(new QueryVO());
    }
}
