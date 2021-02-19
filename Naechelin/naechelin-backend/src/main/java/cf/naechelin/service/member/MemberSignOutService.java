package cf.naechelin.service.member;

import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberVO;

public interface MemberSignOutService
{
    void doService(MemberVO member) throws MemberException;
}
