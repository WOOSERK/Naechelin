package cf.naechelin.service.storeState;

import cf.naechelin.dao.StoreStateDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreStateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("storeStateUpdateService")
public class StoreStateUpdateServiceImpl implements StoreStateUpdateService
{
    @Autowired
    @Qualifier("storeStateDAO")
    private StoreStateDAO storeStateDAO;

    @Override
    public void doService(String storeStateType, String storeStateName) throws StoreException
    {
        StoreStateVO storeState = new StoreStateVO(storeStateType, storeStateName);
        storeStateDAO.update(storeState);
    }
}
