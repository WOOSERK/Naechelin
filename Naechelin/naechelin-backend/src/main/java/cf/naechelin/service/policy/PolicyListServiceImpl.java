package cf.naechelin.service.policy;

import cf.naechelin.dao.PolicyDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.PolicyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("policyListService")
public class PolicyListServiceImpl implements PolicyListService
{
    @Autowired
    @Qualifier("policyDAO")
    private PolicyDAO policyDAO;

    @Override
    public List<PolicyVO> doService(String policyDay) throws StoreException
    {
        PolicyVO policy = new PolicyVO();
        policy.setPolicyDay(policyDay);
        return policyDAO.list(policy);
    }
}
