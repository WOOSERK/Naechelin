package cf.naechelin.service.member;

import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberVO;

import javax.servlet.http.HttpSession;

public interface MemberLoginService
{
    MemberVO doService (String memberEmail, String memberPass) throws MemberException;
}
