package cf.naechelin.service.storeState;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreStateVO;

public interface StoreStateViewService
{
    StoreStateVO doService(String storeStateType) throws StoreException;
}
