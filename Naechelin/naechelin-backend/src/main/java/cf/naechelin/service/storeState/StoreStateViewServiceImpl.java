package cf.naechelin.service.storeState;

import cf.naechelin.dao.StoreStateDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreStateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("storeStateViewService")
public class StoreStateViewServiceImpl implements StoreStateViewService
{
    @Autowired
    @Qualifier("storeStateDAO")
    private StoreStateDAO storeStateDAO;

    @Override
    public StoreStateVO doService(String storeStateType) throws StoreException
    {
        StoreStateVO storeState = new StoreStateVO();
        return storeStateDAO.view(storeState);
    }
}
