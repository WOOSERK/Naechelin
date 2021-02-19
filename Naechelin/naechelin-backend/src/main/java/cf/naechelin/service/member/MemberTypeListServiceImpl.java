package cf.naechelin.service.member;

import cf.naechelin.dao.MemberTypeDAO;
import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("memberTypeListService")
public class MemberTypeListServiceImpl implements MemberTypeListService
{
    @Autowired
    @Qualifier("memberTypeDAO")
    private MemberTypeDAO dao;

    @Override
    public void doService(MemberTypeVO memberType) throws MemberException
    {
        dao.selectByMemberTypeName(memberType.getMembertypeName());
    }
}
