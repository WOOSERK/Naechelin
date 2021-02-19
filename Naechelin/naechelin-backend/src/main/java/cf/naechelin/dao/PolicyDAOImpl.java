package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.mapper.PolicyMapper;
import cf.naechelin.vo.PolicyVO;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("policyDAO")
public class PolicyDAOImpl implements PolicyDAO
{
    @Autowired
    private PolicyMapper mapper;

    @Override
    public void insert(PolicyVO policy) throws StoreException
    {
        mapper.insert(policy);
    }

    @Override
    public void update(PolicyVO policy) throws StoreException
    {
        mapper.update(policy);
    }

    @Override
    public void delete(PolicyVO policy) throws StoreException
    {
        mapper.delete(policy);
    }

    @Override
    public PolicyVO view(PolicyVO policy) throws StoreException
    {
        return mapper.view(policy);
    }

    @Override
    public List<PolicyVO> list(PolicyVO policy) throws StoreException
    {
        return mapper.list(policy);
    }
}
