package cf.naechelin.service.store;

import cf.naechelin.dao.StoreDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreVO;
import cf.naechelin.vo.VisitVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("storeHowManyVisitsService")
public class StoreHowManyVisitsServiceImpl implements StoreHowManyVisitsService
{
    @Autowired
    @Qualifier("storeDAO")
    private StoreDAO storeDAO;

    @Override
    public List<VisitVO> doService(StoreVO store) throws StoreException
    {
        return storeDAO.howManyVisits(store);
    }
}
