package cf.naechelin.service.store;

import cf.naechelin.dao.StoreDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("storeDeleteService")
public class StoreDeleteServiceImpl implements StoreDeleteService
{
    @Autowired
    @Qualifier("storeDAO")
    private StoreDAO storeDAO;

    @Override
    public void doService(StoreVO store) throws StoreException
    {
        storeDAO.delete(store);
    }
}
