package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("reviewListService")
public class ReviewListServiceImpl implements ReviewListService
{
    @Autowired
    ReviewDAO reviewDao;

    @Override
    public List<ReviewVO> doService(String condition, int intWord) throws ReviewException
    {
        QueryVO query = new QueryVO();
        query.setCondition(condition);
        query.setIntWord(intWord);
        ArrayList<ReviewVO> list = (ArrayList<ReviewVO>)reviewDao.getList(query);
        return list;
    }
}
