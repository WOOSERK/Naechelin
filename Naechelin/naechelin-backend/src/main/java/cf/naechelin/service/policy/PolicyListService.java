package cf.naechelin.service.policy;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.PolicyVO;

import java.util.List;

public interface PolicyListService
{
    List<PolicyVO> doService(String policyDay) throws StoreException;
}
