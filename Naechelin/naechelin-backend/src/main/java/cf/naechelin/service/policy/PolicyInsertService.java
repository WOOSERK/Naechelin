package cf.naechelin.service.policy;

import cf.naechelin.exception.store.StoreException;

public interface PolicyInsertService
{
    void doService(int storeId, String storeDay, String storeContent) throws StoreException;
}
