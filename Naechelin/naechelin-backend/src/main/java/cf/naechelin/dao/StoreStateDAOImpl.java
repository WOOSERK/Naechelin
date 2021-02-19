package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.mapper.StoreStateMapper;
import cf.naechelin.vo.StoreStateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("storeStateDAO")
public class StoreStateDAOImpl implements StoreStateDAO
{
    @Autowired
    StoreStateMapper mapper;

    @Override
    public void insert(StoreStateVO storeState) throws StoreException
    {
       mapper.insert(storeState);
    }

    @Override
    public void update(StoreStateVO storeState) throws StoreException
    {
        mapper.update(storeState);
    }

    @Override
    public void delete(StoreStateVO storeState) throws StoreException
    {
        mapper.delete(storeState);
    }

    @Override
    public StoreStateVO view(StoreStateVO storeState) throws StoreException
    {
        return mapper.view(storeState);
    }

    @Override
    public List<StoreStateVO> list() throws StoreException
    {
        return mapper.list();
    }
}
