package cf.naechelin.dao;

import cf.naechelin.exception.MemberException;
import cf.naechelin.mapper.MemberTypeMapper;
import cf.naechelin.vo.MemberTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberTypeDAO")
public class MemberTypeDAOImpl implements MemberTypeDAO
{
    @Autowired
    MemberTypeMapper memberTypeMapper;

    @Override
    public void insert(MemberTypeVO memberType) throws MemberException
    {
        memberTypeMapper.insert(memberType);
    }

    @Override
    public void update(MemberTypeVO memberType) throws MemberException
    {
        memberTypeMapper.update(memberType);
    }

    @Override
    public void delete(MemberTypeVO memberType) throws MemberException
    {
        memberTypeMapper.delete(memberType);
    }

    @Override
    public MemberTypeVO selectByMemberTypeName(String memberTypeName) throws MemberException
    {
        return memberTypeMapper.selectByMemberTypeName(memberTypeName);
    }
}
