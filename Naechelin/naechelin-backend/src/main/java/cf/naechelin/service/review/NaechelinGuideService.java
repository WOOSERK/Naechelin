package cf.naechelin.service.review;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.NaechelinStarVO;

import java.util.List;

public interface NaechelinGuideService
{
    List<NaechelinStarVO> doService()throws ReviewException;
}
