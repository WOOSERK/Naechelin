package cf.naechelin.service.storeType;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreTypeVO;

public interface StoreTypeViewService
{
    StoreTypeVO doService(String storeTypeType) throws StoreException;
}
