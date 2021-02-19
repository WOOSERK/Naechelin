package cf.naechelin.service.member;

import cf.naechelin.dao.MemberDAO;
import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("memberLoginService")
public class MemberLoginServiceImpl implements MemberLoginService
{
    @Autowired
    @Qualifier("memberDAO")
    private MemberDAO dao;

    @Override
    public MemberVO doService(String memberEmail, String memberPass) throws MemberException
    {
        return dao.login(memberEmail, memberPass);
    }
}
