package cf.naechelin.service.store;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.MemberVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface StoreListByMemberIdService
{
    List<StoreVO> doService(MemberVO member) throws StoreException;
}
