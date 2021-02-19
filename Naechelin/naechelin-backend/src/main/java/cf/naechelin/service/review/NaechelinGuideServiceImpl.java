package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.NaechelinStarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("naechelinGuideService")
public class NaechelinGuideServiceImpl implements NaechelinGuideService
{
    @Autowired
    ReviewDAO reviewDao;

    @Override
    public List<NaechelinStarVO> doService() throws ReviewException
    {
        return reviewDao.getStoreList();
    }
}
