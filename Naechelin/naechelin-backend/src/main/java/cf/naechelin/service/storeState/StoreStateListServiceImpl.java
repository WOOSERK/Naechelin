package cf.naechelin.service.storeState;

import cf.naechelin.dao.StoreStateDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreStateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("storeStateListService")
public class StoreStateListServiceImpl implements StoreStateListService
{
    @Autowired
    @Qualifier("storeStateDAO")
    private StoreStateDAO storeStateDAO;

    @Override
    public List<StoreStateVO> doService() throws StoreException
    {
        return storeStateDAO.list();
    }
}
