package cf.naechelin.service.likey;

import cf.naechelin.dao.LikeyDAO;
import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;
import cf.naechelin.vo.NaechelinStarVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("likeyListService")
public class LikeyListServiceImpl implements LikeyListService
{
    @Autowired
    @Qualifier("likeyDao")
    LikeyDAO likeyDao;

    @Override
    public List<NaechelinStarVO> doService(String condition,int intWord) throws LikeyException
    {
        List<NaechelinStarVO> list;
        QueryVO query = new QueryVO(condition,intWord);
        try
        {
            list = likeyDao.LikeStoreList(query);
        }
        catch(LikeyException e){
            e.setMessage("Likey list get error");
            throw e;
        }
        return list;
    }
}
