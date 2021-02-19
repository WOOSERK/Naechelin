package cf.naechelin.service.storeType;

import cf.naechelin.dao.StoreTypeDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("storeTypeViewService")
public class StoreTypeViewServiceImpl implements StoreTypeViewService
{
    @Autowired
    @Qualifier("storeTypeDAO")
    private StoreTypeDAO storeTypeDAO;

    @Override
    public StoreTypeVO doService(String storeTypeType) throws StoreException
    {
        StoreTypeVO storeType = new StoreTypeVO();
        storeType.setStoreTypeType(storeTypeType);
        return storeTypeDAO.view(storeType);
    }
}
