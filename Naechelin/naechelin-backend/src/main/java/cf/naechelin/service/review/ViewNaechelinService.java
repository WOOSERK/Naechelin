package cf.naechelin.service.review;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.NaechelinStarVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface ViewNaechelinService
{
    List<NaechelinStarVO> doService(String condition, int intWord)throws ReviewException;
}
