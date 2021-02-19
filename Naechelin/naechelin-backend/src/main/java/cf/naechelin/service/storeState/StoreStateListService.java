package cf.naechelin.service.storeState;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreStateVO;

import java.util.List;

public interface StoreStateListService
{
    List<StoreStateVO> doService() throws StoreException;
}
