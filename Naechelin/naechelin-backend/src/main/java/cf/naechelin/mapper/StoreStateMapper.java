package cf.naechelin.mapper;

import cf.naechelin.vo.StoreStateVO;
import cf.naechelin.vo.StoreTypeVO;

import java.util.List;

public interface StoreStateMapper
{
    void insert(StoreStateVO storeState);
    void update(StoreStateVO storeState);
    void delete(StoreStateVO storeState);
    StoreStateVO view(StoreStateVO storeState);
    List<StoreStateVO> list();
}
