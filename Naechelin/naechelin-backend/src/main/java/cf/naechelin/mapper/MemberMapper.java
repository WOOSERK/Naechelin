package cf.naechelin.mapper;

import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberVO;

import java.util.List;

public interface MemberMapper {
    void insert(MemberVO member) throws MemberException;
    void update(MemberVO member) throws MemberException;
    void delete(String memberEmail) throws MemberException;
    MemberVO selectByMemberEmail(String memberEmail) throws MemberException;
    MemberVO selectByMemberNick(String memberNick) throws  MemberException;
    List<MemberVO> list() throws MemberException;
    MemberVO login(String memberEmail, String memberPass) throws MemberException;
}
