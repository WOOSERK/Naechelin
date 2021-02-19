package cf.naechelin.service.storeType;

import cf.naechelin.dao.StoreTypeDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("storeTypeListService")
public class StoreTypeListServiceImpl implements StoreTypeListService
{
    @Autowired
    @Qualifier("storeTypeDAO")
    private StoreTypeDAO storeTypeDAO;

    @Override
    public List<StoreTypeVO> doService() throws StoreException
    {
        return storeTypeDAO.list();
    }
}
