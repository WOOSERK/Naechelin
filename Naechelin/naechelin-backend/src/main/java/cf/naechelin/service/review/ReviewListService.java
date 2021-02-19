package cf.naechelin.service.review;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.ReviewVO;

import java.util.List;

public interface ReviewListService
{
    List<ReviewVO> doService(String condition, int intWord)throws ReviewException;
}
