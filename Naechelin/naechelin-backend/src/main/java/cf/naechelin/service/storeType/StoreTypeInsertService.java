package cf.naechelin.service.storeType;

import cf.naechelin.exception.store.StoreException;

public interface StoreTypeInsertService
{
    void doService(String storeTypeType, String storeTypeName) throws StoreException;
}
