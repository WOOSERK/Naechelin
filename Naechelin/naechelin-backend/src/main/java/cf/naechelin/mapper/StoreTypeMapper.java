package cf.naechelin.mapper;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreTypeVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface StoreTypeMapper
{
    void insert(StoreTypeVO storeType)throws StoreException;
    void update(StoreTypeVO storeType)throws StoreException;
    void delete(StoreTypeVO storeType)throws StoreException;
    StoreTypeVO view(StoreTypeVO storeType)throws StoreException;
    List<StoreTypeVO> list()throws StoreException;
}
