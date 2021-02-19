package cf.naechelin.service.store;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreVO;

public interface StoreUpdateService
{
    void doService(StoreVO store) throws StoreException;
}
