package cf.naechelin.service.store;

import cf.naechelin.dao.StoreDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("storeViewService")
public class StoreViewServiceImpl implements StoreViewService
{
    @Autowired
    @Qualifier("storeDAO")
    private StoreDAO storeDAO;

    @Override
    public StoreVO doService(int storeId) throws StoreException
    {
        StoreVO store = new StoreVO();
        store.setStoreId(storeId);
        return storeDAO.view(store);
    }
}
