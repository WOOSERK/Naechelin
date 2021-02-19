package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreTypeVO;

import java.util.List;

public interface StoreTypeDAO
{
   void insert(StoreTypeVO storeType) throws StoreException;
   void update(StoreTypeVO storeType) throws StoreException;
   void delete(StoreTypeVO storeType) throws StoreException;
   StoreTypeVO view(StoreTypeVO storeType) throws StoreException;
   List<StoreTypeVO> list() throws StoreException;
}
