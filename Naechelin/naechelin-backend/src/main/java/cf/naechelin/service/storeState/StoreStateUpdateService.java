package cf.naechelin.service.storeState;

import cf.naechelin.exception.store.StoreException;

public interface StoreStateUpdateService
{
    void doService(String storeStateType, String storeStateName) throws StoreException;
}
