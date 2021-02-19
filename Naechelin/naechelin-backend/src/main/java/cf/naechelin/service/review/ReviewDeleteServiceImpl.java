package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.MissionVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("reviewDeleteService")
public class ReviewDeleteServiceImpl implements ReviewDeleteService
{
    @Autowired
    ReviewDAO reviewDAO;

    @Override
    public void doService(int memberId, int storeId)throws ReviewException
    {
        ReviewVO review = new ReviewVO();
        review.setLineId(reviewDAO.findLineId(memberId));
        review.setStoreId(storeId);
        MissionVO missionVO = reviewDAO.insertCheck(review);

        if(missionVO.getMissionSuccessTime() == null){
            throw new ReviewException("리뷰 삭제 실패, 먼저 방문해 주세요.");
        }

        reviewDAO.delete(review);
    }
}
