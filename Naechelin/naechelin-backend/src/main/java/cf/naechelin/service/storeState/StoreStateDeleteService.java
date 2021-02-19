package cf.naechelin.service.storeState;

import cf.naechelin.exception.store.StoreException;

public interface StoreStateDeleteService
{
    void doService(String storeStateType) throws StoreException;
}
