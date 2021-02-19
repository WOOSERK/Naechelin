package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreStateVO;
import cf.naechelin.vo.StoreTypeVO;

import java.util.List;

public interface StoreStateDAO
{
    void insert(StoreStateVO storeState) throws StoreException;
    void update(StoreStateVO storeState) throws StoreException;
    void delete(StoreStateVO storeState) throws StoreException;
    StoreStateVO view(StoreStateVO storeState) throws StoreException;
    List<StoreStateVO> list() throws StoreException;
}
