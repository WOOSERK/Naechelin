package cf.naechelin.service.policy;

import cf.naechelin.dao.PolicyDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.PolicyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("policyViewService")
public class PolicyViewServiceImpl implements PolicyViewService
{
    @Autowired
    @Qualifier("policyDAO")
    private PolicyDAO policyDAO;

    @Override
    public PolicyVO doService(PolicyVO policy) throws StoreException
    {
        return policyDAO.view(policy);
    }
}
