package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.NaechelinStarVO;
import cf.naechelin.vo.QueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("viewNaechelinService")
public class ViewNaechelinServiceImpl implements ViewNaechelinService
{
    @Autowired
    ReviewDAO reviewDao;

    @Override
    public List<NaechelinStarVO> doService(String condition, int intWord) throws ReviewException
    {
        QueryVO query = new QueryVO();
        query.setCondition(condition);
        query.setIntWord(intWord);
        ArrayList<NaechelinStarVO> list = (ArrayList<NaechelinStarVO>)reviewDao.getNaechelinList(query);
        return list;
    }
}
