package cf.naechelin.service.store;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;

public interface StoreViewService
{
    StoreVO doService(int storeId) throws StoreException;
}
