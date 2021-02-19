package cf.naechelin.service.storeType;

import cf.naechelin.dao.StoreTypeDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("storeTypeInsertService")
public class StoreTypeInsertServiceImpl implements StoreTypeInsertService
{
    @Autowired
    @Qualifier("storeTypeDAO")
    private StoreTypeDAO storeTypeDAO;

    @Override
    public void doService(String storeTypeType, String storeTypeName) throws StoreException
    {
        StoreTypeVO storeType = new StoreTypeVO(storeTypeType, storeTypeName);
        storeTypeDAO.insert(storeType);
    }
}
