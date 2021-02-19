package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.*;

import java.util.List;

public interface StoreDAO
{
    void insert(StoreVO store) throws StoreException;
    void update(StoreVO store) throws StoreException;
    void delete(StoreVO store) throws StoreException;
    StoreVO view(StoreVO store) throws StoreException;
    List<StoreVO> listByStoreTypeType(StoreTypeVO storeTypeVO) throws StoreException;
    List<StoreVO> listByStoreStateType(StoreStateVO storeState) throws StoreException;
    List<StoreVO> listByMemberId(MemberVO member) throws StoreException;
    void insertRequest(StoreVO store) throws StoreException;
    void updateRequest(StoreVO store) throws StoreException;
    void deleteRequest(StoreVO store) throws StoreException;

    List<VisitVO> howManyVisits(StoreVO store) throws StoreException;

}
