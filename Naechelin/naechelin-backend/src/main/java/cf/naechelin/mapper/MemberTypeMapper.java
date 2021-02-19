package cf.naechelin.mapper;

import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberTypeVO;

public interface MemberTypeMapper
{
    void insert(MemberTypeVO memberType) throws MemberException;
    void update(MemberTypeVO memberType) throws MemberException;
    void delete(MemberTypeVO memberType) throws MemberException;
    MemberTypeVO selectByMemberTypeName(String memberTypeName) throws MemberException;
}
