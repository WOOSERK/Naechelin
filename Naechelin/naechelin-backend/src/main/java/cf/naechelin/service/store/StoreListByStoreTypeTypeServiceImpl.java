package cf.naechelin.service.store;

import cf.naechelin.dao.StoreDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreTypeVO;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("storeListByStoreTypeTypeService")
public class StoreListByStoreTypeTypeServiceImpl implements StoreListByStoreTypeTypeService
{
    @Autowired
    @Qualifier("storeDAO")
    private StoreDAO storeDAO;

    @Override
    public List<StoreVO> doService(StoreTypeVO storeType) throws StoreException
    {
        return storeDAO.listByStoreTypeType(storeType);
    }
}
