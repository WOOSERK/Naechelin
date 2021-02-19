package cf.naechelin.service.policy;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.PolicyVO;

public interface PolicyViewService
{
    PolicyVO doService(PolicyVO policy) throws StoreException;
}
