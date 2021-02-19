package cf.naechelin.service.review;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.ReviewVO;

public interface ReviewDetailService
{
    ReviewVO doService(ReviewVO review)throws ReviewException;
}
