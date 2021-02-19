package cf.naechelin.dao;

import cf.naechelin.exception.MemberException;
import cf.naechelin.exception.QuestionException;
import cf.naechelin.mapper.MemberMapper;
import cf.naechelin.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO
{
    @Autowired
    MemberMapper memberMapper;

    @Override
    public void insert(MemberVO member) throws MemberException
    {
        memberMapper.insert(member);
    }

    @Override
    public void update(MemberVO member) throws MemberException
    {
        memberMapper.update(member);
    }

    @Override
    public void delete(String memberEmail) throws MemberException
    {
        memberMapper.delete(memberEmail);
    }

    @Override
    public MemberVO login(String memberEmail, String memberPass) throws MemberException
    {
        return memberMapper.login(memberEmail, memberPass);
    }

    @Override
    public MemberVO selectByMemberEmail(String memberEmail) throws MemberException
    {
        return memberMapper.selectByMemberEmail(memberEmail);
    }

    @Override
    public MemberVO selectByMemberNick(String memberNick) throws MemberException
    {
        return memberMapper.selectByMemberNick(memberNick);
    }

    @Override
    public List<MemberVO> list() throws MemberException
    {
        return memberMapper.list();
    }

}