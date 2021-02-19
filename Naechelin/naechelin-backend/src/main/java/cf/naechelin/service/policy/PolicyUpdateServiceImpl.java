package cf.naechelin.service.policy;

import cf.naechelin.dao.PolicyDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.PolicyVO;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("policyUpdateService")
public class PolicyUpdateServiceImpl implements PolicyUpdateService
{
    @Autowired
    @Qualifier("policyDAO")
    private PolicyDAO policyDAO;

    @Override
    public void doService(PolicyVO policy) throws StoreException
    {
        policyDAO.update(policy);
    }
}
