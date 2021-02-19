package cf.naechelin.service.store;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreVO;
import cf.naechelin.vo.VisitVO;

import java.util.List;

public interface StoreHowManyVisitsService
{
    List<VisitVO> doService(StoreVO store) throws StoreException;
}
