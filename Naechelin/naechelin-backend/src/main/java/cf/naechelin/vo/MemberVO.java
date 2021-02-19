package cf.naechelin.vo;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

enum Gender { M, F };

public class MemberVO
{
    private int memberId;
    private String memberEmail;
    private String memberPass;
    private String memberNick;
    private Date memberBirth;
    private Gender memberGender;
    private String memberType;
    private Timestamp memberRegDate;
    private Timestamp memberEndDate;
    private String memberTel;
    private List<StoreVO> storeList;
    private MemberTypeVO memberTypeVO;

    public MemberVO() { }

	public MemberVO(int memberId, String memberEmail, String memberPass, String memberNick, Date memberBirth,
			Gender memberGender, String memberType, Timestamp memberRegDate, Timestamp memberEndDate, String memberTel,
			List<StoreVO> storeList, MemberTypeVO memberTypeVO) {
		super();
		this.memberId = memberId;
		this.memberEmail = memberEmail;
		this.memberPass = memberPass;
		this.memberNick = memberNick;
		this.memberBirth = memberBirth;
		this.memberGender = memberGender;
		this.memberType = memberType;
		this.memberRegDate = memberRegDate;
		this.memberEndDate = memberEndDate;
		this.memberTel = memberTel;
		this.storeList = storeList;
		this.memberTypeVO = memberTypeVO;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPass() {
		return memberPass;
	}

	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	public Date getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}

	public Gender getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(Gender memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public Timestamp getMemberRegDate() {
		return memberRegDate;
	}

	public void setMemberRegDate(Timestamp memberRegDate) {
		this.memberRegDate = memberRegDate;
	}

	public Timestamp getMemberEndDate() {
		return memberEndDate;
	}

	public void setMemberEndDate(Timestamp memberEndDate) {
		this.memberEndDate = memberEndDate;
	}

	public String getMemberTel() {
		return memberTel;
	}

	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}

	public List<StoreVO> getStoreList() {
		return storeList;
	}

	public void setStoreList(List<StoreVO> storeList) {
		this.storeList = storeList;
	}

	public MemberTypeVO getMemberTypeVO() {
		return memberTypeVO;
	}

	public void setMemberTypeVO(MemberTypeVO memberTypeVO) {
		this.memberTypeVO = memberTypeVO;
	}
}
