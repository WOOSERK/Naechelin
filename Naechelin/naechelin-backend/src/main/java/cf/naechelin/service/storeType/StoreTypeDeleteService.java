package cf.naechelin.service.storeType;

import cf.naechelin.exception.store.StoreException;

public interface StoreTypeDeleteService
{
    void doService(String storeTypeType) throws StoreException;
}
