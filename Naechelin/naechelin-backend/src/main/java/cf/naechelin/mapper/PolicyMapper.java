package cf.naechelin.mapper;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.PolicyVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface PolicyMapper
{
    void insert(PolicyVO policy)throws StoreException;
    void update(PolicyVO policy)throws StoreException;
    void delete(PolicyVO policy)throws StoreException;
    PolicyVO view(PolicyVO policy)throws StoreException;
    List<PolicyVO> list(PolicyVO policy) throws StoreException;
}
