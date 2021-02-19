package cf.naechelin.service.store;

import cf.naechelin.dao.StoreDAO;
import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.MemberVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("storeListByMemberIdService")
public class StoreListByMemberIdServiceImpl implements StoreListByMemberIdService
{
    @Autowired
    @Qualifier("storeDAO")
    private StoreDAO storeDAO;

    @Override
    public List<StoreVO> doService(MemberVO member) throws StoreException
    {
        return storeDAO.listByMemberId(member);
    }
}
