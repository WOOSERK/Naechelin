package cf.naechelin.service.storeState;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreStateVO;

public interface StoreStateInsertService
{
    void doService(String storeStateType, String storeStateName) throws StoreException;
}
