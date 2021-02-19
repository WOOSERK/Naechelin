package cf.naechelin.service.storeType;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreTypeVO;

import java.util.List;

public interface StoreTypeListService
{
    List<StoreTypeVO> doService() throws StoreException;
}
