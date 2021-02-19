package cf.naechelin.service.policy;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.PolicyVO;
import cf.naechelin.vo.StoreVO;

public interface PolicyUpdateService
{
    void doService(PolicyVO policy) throws StoreException;
}
