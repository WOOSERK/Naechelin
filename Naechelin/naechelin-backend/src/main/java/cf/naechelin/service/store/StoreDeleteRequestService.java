package cf.naechelin.service.store;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreVO;

public interface StoreDeleteRequestService
{
    void doService(StoreVO store) throws StoreException;
}