package cf.naechelin.dao;

import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberTypeVO;

public interface MemberTypeDAO
{
    void insert(MemberTypeVO memberType) throws MemberException;
    void update(MemberTypeVO memberType) throws MemberException;
    void delete(MemberTypeVO memberType) throws MemberException;
    MemberTypeVO selectByMemberTypeName(String memberTypeName) throws MemberException;
}
