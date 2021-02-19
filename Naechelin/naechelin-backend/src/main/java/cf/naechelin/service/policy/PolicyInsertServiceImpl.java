package cf.naechelin.service.policy;

import cf.naechelin.dao.PolicyDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.PolicyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("policyInsertService")
public class PolicyInsertServiceImpl implements PolicyInsertService
{
    @Autowired
    @Qualifier("policyDAO")
    private PolicyDAO policyDAO;

    @Override
    public void doService(int storeId, String storeDay, String storeContent) throws StoreException
    {
        PolicyVO policy = new PolicyVO(storeId, storeDay, storeContent);
        policyDAO.insert(policy);
    }
}
