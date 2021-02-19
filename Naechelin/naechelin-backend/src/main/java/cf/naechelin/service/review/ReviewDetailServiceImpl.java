package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("reviewDetailService")
public class ReviewDetailServiceImpl implements ReviewDetailService
{
    @Autowired
    ReviewDAO reviewDao;

    @Override
    public ReviewVO doService(ReviewVO review) throws ReviewException
    {
        return reviewDao.getStoreReview(review);
    }
}
