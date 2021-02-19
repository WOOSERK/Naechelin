package cf.naechelin.dao;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.*;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

public interface ReviewDAO
{
    void insert(ReviewVO review)throws ReviewException; // 리뷰 작성
    void delete(ReviewVO review) throws ReviewException; // 리뷰 삭제
    List<ReviewVO> getList(QueryVO query)throws ReviewException; // 리뷰 목록 가져오기 ( 가게의 )
    ReviewVO getStoreReview(ReviewVO review) throws ReviewException; // 리뷰 상세 보기
    List<NaechelinStarVO> getNaechelinList(QueryVO query)throws ReviewException; // 내슐랭
    List<NaechelinStarVO> getStoreList()throws ReviewException; // 내슐랭 가이드
    MissionVO insertCheck(ReviewVO review)throws ReviewException; // insert시 매장 방문 체크
    int findLineId(int memberId)throws ReviewException;
    void reviewEdit(ReviewVO review)throws ReviewException;
}
